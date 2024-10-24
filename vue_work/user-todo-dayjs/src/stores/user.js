import { defineStore } from "pinia";

export const useUserStore = defineStore('user',{
    //변수
    state: () => ({
        loginCheck: false,
        nickName:'',
        thumbnail:'',
        profileImage:'',
        email:'',
    }),
    //함수
    actions: {
        login(data)  {
            this.loginCheck = true;
            this.userId = data.userId;
            this.nickName = data.nickName;
            this.thumbnail = data.thumbnail_image;
            this.profileImage = data.profileImage_image;
            this.email = data.email;
        },
        logout ()  {
            this.loginCheck = false;
            this.userId = '';
            this.nickName = '';
            this.thumbnail = '';
            this.profileImage = '';
            this.email = '';
        }
    },
});