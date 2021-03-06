import React from 'react'
import Spacer from '../../components/users/common/spacer/spacer'
import Testimonals from '../../components/users/common/testimonals/testimonals'
import WhyUs from '../../components/users/common/whyus/whyus'
import Bookbar from '../../components/users/home/bookbar/bookbar'
import PopularCars from '../../components/users/home/popular-cars/popular-cars'
import Slider from '../../components/users/home/slider/slider'

const HomePage = () => {
  return (
    <>
      <Slider/>
      <Bookbar/>
      <Spacer/>
      <PopularCars/>
      <Spacer/>
      <Testimonals/>
      <Spacer/>
      <WhyUs/>
      <Spacer/>
    </>
  )
}

export default HomePage