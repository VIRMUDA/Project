/** @type {import('tailwindcss').Config} */
module.exports = {
  content: ['./src/**/*.{js,ts,jsx,tsx}'],
  theme: {
    extend: {
      colors: {
        // 허니즈
        'honey-churros': '#FFD8D9',
        'honey-aya': '#d1afe3',
        'honey-ddd': '#ffbf00',
        'honey-damyui': '#b7e8ff',
        'honey-ohwayo': '#8c8c8c',
        'honey-mangnae': '#1f1e24',
        // 이세돌
        'isedol-ine': '#8A2BE2',
        'isedol-jingburger': '#F0A957',
        'isedol-lilpa': '#000080',
        'isedol-jururu': '#F40086',
        'isedol-gosegu': '#467EC6',
        'isedol-viichan': '#95C100',
        // 스텔라이브
        'stellive-hina': '#F2DCBF',
        'stellive-tabi': '#71C5E8',
        'stellive-mashiro': '#B5B0B2',
        'stellive-yuni': '#B77DE4',
        'stellive-kanna': '#373584',
        'stellive-lize': '#971B2F',
        // 그라데이션에 필요한 색상
        'custom-pink': '#F8A4FF',
        'custom-sky': '#67E3E3',
        'custom-yellow': '#FFFEDC',
        'custom-blue': '#92C1FF',
      },
    },
  },
  plugins: [],
};

