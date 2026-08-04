package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: lؘٖ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5754l {
    public static final Set yandex = AbstractC8669l.m2407import(new String[]{"max-age", "expires", "domain", "path", "secure", "httponly", "$x-enc"});
    public static final C11155l loadAd = new C11155l("(^|;)\\s*([^;=\\{\\}\\s]+)\\s*(=\\s*(\"[^\"]*\"|[^;]*))?");
    public static final Set crashlytics = AbstractC8669l.m2407import(new Character[]{';', ',', '\"'});

    public static final Map yandex(String str, boolean z) {
        C14432l<C8195l> c14432lFirebase = AbstractC17587l.firebase(new C11100l(C11155l.yandex(loadAd, str), new C4741l(0)), new C13816l(z, 1));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C8195l c8195l : c14432lFirebase) {
            String str2 = (String) c8195l.f17097l;
            if (AbstractC16648l.isVip(str2, "\"", false) && AbstractC16648l.Signature(str2, "\"", false)) {
                c8195l = new C8195l(c8195l.f17098l, AbstractC12024l.m3342super(str2));
            }
            linkedHashMap.put(c8195l.f17098l, c8195l.f17097l);
        }
        int size = linkedHashMap.size();
        if (size == 0) {
            return C14054l.f27396l;
        }
        if (size != 1) {
            return linkedHashMap;
        }
        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }
}
