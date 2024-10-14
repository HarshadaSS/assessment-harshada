export interface hotelResponse{
    id:number
    name:string
    roomPrice:number
    imageUrl:string
    description:string
    rating:5,
    city:string
    email:string
    wifi:string
    gym:string
    pool:string
}

export interface getRepsonse{
    data:hotelResponse[]
    message:string
}