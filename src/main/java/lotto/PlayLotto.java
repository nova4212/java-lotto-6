package lotto;

import java.util.ArrayList;
import java.util.List;

public class PlayLotto {
    private static List<Lotto> Lottos = new ArrayList<>();
    public void start(){
        int Chance = LottoIssue();
        Lottos = makeLottoNum(Chance);
        //System.out.println(Lottos.get(7).getNumbers());

    }
    public int LottoIssue(){
        LottoInput lottoInput = new LottoInput();
        int lottoMoney = lottoInput.getLottoPrice();
        LottoPrice lottoPrice = new LottoPrice(lottoMoney);
        return lottoPrice.makeReturnNum();
    }
    public List<Lotto> makeLottoNum(int Chance){
        GenLotto genLotto = new GenLotto();
        Lottos = genLotto.makeLottoNum(Chance);
        return Lottos;
    }
}
