package org.bouncycastle.jcajce.provider.util;

import defpackage.Cfor;
import defpackage.InterfaceC0543l;
import defpackage.InterfaceC5594l;
import defpackage.InterfaceC8134l;
import java.util.HashMap;
import java.util.Map;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public class SecretKeyUtil {
    private static Map<Cfor, Integer> keySizes;

    static {
        HashMap map = new HashMap();
        keySizes = map;
        map.put(InterfaceC0543l.f1872implements, 192);
        keySizes.put(InterfaceC8134l.ad, 128);
        keySizes.put(InterfaceC8134l.f16996throws, 192);
        Map<Cfor, Integer> map2 = keySizes;
        Cfor cfor = InterfaceC8134l.f16949for;
        Integer numValueOf = Integer.valueOf(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        map2.put(cfor, numValueOf);
        keySizes.put(InterfaceC5594l.yandex, 128);
        keySizes.put(InterfaceC5594l.loadAd, 192);
        keySizes.put(InterfaceC5594l.crashlytics, numValueOf);
    }

    public static int getKeySize(Cfor cfor) {
        Integer num = keySizes.get(cfor);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }
}
