package com.jongmin.upbit.exchange.account

interface UpbitAccountsService {

    /**
     * 전체 계좌 조회
     * 내가 보유한 자산 리스트를 보여줍니다.
     *
     * @return 자산 리스트
     */
    fun getAccounts(): UpbitAccounts
}
