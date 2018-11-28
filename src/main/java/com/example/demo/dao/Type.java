package com.example.demo.dao;

import java.io.Serializable;
import java.util.List;
/**
 * Created by li on 2018/11/21.
 */
public class Type implements Serializable {
        int id;
        String typename;
        List<user> list;
        public List<user> getList() {
            return list;
        }
        public void setList(List<user> list) {
            this.list = list;
        }
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public String getTypename() {
            return typename;
        }
        public void setTypename(String typename) {
            this.typename = typename;
        }
        public List<user> getUserList() {
            return list;
        }
        public void setUserList(List<user> userList) {
            this.list = userList;
        }

    }


