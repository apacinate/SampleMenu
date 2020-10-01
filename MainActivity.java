package com.example.menusample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private ListView _lvMenu;
    private List<Map<String, Object>> _menuList;

    private static final String[] FROM = {"name","price"};
    private static final int[] TO ={R.id.tvMenuName, R.id.tvMenuPrice};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_thanks);
        _lvMenu = findViewById(R.id.lvMenu);
        _menuList = createTeishokuList();
        SimpleAdapter adapter = new SimpleAdapter(MainActivity.this, _menuList, R.layout.row, FROM, TO);
        _lvMenu.setAdapter(adapter);
        _lvMenu.setOnItemClickListener(new ListItemClickListener());
    }

    private List<Map<String,Object>>createTeishokuList(){
        List<Map<String,Object>> menuList = new ArrayList<>();
        Map<String,Object>menu = new HashMap();

        menu = new HashMap<>();
        menu.put("name","唐揚げ定食");
        menu.put("price",800);
        menu.put("desc","若鳥のから揚げにサラダ、ご飯とお味噌汁が付きます。");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name","焼き魚定食");
        menu.put("price",750);
        menu.put("desc","鯖か鯵を選んでいただき、ご飯とお味噌汁が付きます。");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name","ハンバーグ定食");
        menu.put("price",850);
        menu.put("desc","サラダ、ご飯とお味噌汁が付きます。");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name","焼きそば定食");
        menu.put("price",800);
        menu.put("desc","ブタか牛を選んでいただき、ご飯とお味噌汁が付きます。");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name","お好み焼き定食");
        menu.put("price",850);
        menu.put("desc","豚か牛を選んでいただき、ご飯とお味噌汁が付きます。");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name","モダン定食");
        menu.put("price",1000);
        menu.put("desc","ご飯とお味噌汁が付きます。");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name","日替わり定食");
        menu.put("price",700);
        menu.put("desc","ご飯とお味噌汁が付きます。ご飯のお代わり５０円");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name","焼肉定食");
        menu.put("price",800);
        menu.put("desc","ご飯とお味噌汁が付きます。");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name","生姜焼き定食");
        menu.put("price",800);
        menu.put("desc","ご飯とお味噌汁が付きます。");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name","唐揚げ定食");
        menu.put("price",800);
        menu.put("desc","若鳥のから揚げにサラダ、ご飯とお味噌汁が付きます。");
        menuList.add(menu);
        menu = new HashMap<>();
        menu.put("name","唐揚げ定食");
        menu.put("price",800);
        menu.put("desc","若鳥のから揚げにサラダ、ご飯とお味噌汁が付きます。");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name","唐揚げ定食");
        menu.put("price",800);
        menu.put("desc","若鳥のから揚げにサラダ、ご飯とお味噌汁が付きます。");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name","唐揚げ定食");
        menu.put("price",800);
        menu.put("desc","若鳥のから揚げにサラダ、ご飯とお味噌汁が付きます。");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name","唐揚げ定食");
        menu.put("price",800);
        menu.put("desc","若鳥のから揚げにサラダ、ご飯とお味噌汁が付きます。");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name","唐揚げ定食");
        menu.put("price",800);
        menu.put("desc","若鳥のから揚げにサラダ、ご飯とお味噌汁が付きます。");
        menuList.add(menu);

        return menuList;
    }

    private class ListItemClickListener implements AdapterView.OnItemClickListener{

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id){
            Map<String,Object>item = (Map<String, Object>)parent.getItemAtPosition(position);
            String menuName = (String)item.get("name");
            Integer menuPrice = (Integer)item.get("price");
            Intent intent = new Intent(MainActivity.this, MenuThanksActivity.class);
            intent.putExtra("menuName", "menuName");
            intent.putExtra("menuPrice",menuPrice+"円");
            startActivity(intent);

        }
    }
}