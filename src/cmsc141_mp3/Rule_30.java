/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cmsc141_mp3;

import java.util.ArrayList;

/**
 *
 * @author parfait
 */
public class Rule_30 {
    public void generator(int generations, String initialState){
        char[] parent = new char[generations];
        char[] child = new char[generations];
        
        parent = initialState.toCharArray();
        
        System.out.println(parent);
        
        for(int ctr=0; ctr < generations; ctr++){
            for(int i = 0; i < initialState.length(); i++){
                if(i == 0){
                    if(parent[i] == '1' && parent[i+1] == '1' )
                        child[i] = '1';
                    else if(parent[i] == '1' && parent[i+1] == '0' )
                        child[i] = '1';
                    else if(parent[i] == '0' && parent[i+1] == '0' )
                        child[i] = '0';
                }
                else if(i == initialState.length()-1){
                    if(parent[i-1] == '1' && parent[i] == '1')
                        child[i] = '0';
                    else if(parent[i-1] == '1' && parent[i] == '0')
                        child[i] = '1';
                    else if(parent[i-1] == '0' && parent[i] == '1')
                        child[i] = '1';
                    if(parent[i-1] == '0' && parent[i] == '0')
                        child[i] = '0';
                }
                else{
                    if(parent[i-1] == '1' && parent[i] == '1' && parent[i+1] == '1' )
                    child[i] = '0';
                    else if(parent[i-1] == '1' && parent[i] == '1' && parent[i+1] == '0')
                        child[i] = '0';
                    else if(parent[i-1] == '1' && parent[i] == '0' && parent[i+1] == '1')
                        child[i] = '0';
                    else if(parent[i-1] == '0' && parent[i] == '0' && parent[i+1] == '0')
                        child[i] = '0';
                    else if(parent[i-1] == '1' && parent[i] == '0' && parent[i+1] == '0')
                        child[i] = '1';
                    else if(parent[i-1] == '0' && parent[i] == '1' && parent[i+1] == '1')
                        child[i] = '1';
                    else if(parent[i-1] == '0' && parent[i] == '1' && parent[i+1] == '0')
                        child[i] = '1';
                    else if(parent[i-1] == '0' && parent[i] == '0' && parent[i+1] == '1')
                        child[i] = '1';
                }

            }
            System.out.println(child);
            parent = child;
        }
    }
}
