package com.google.mlkit.vision.common.internal;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.AbstractC0653l;
import defpackage.AbstractC13582l;
import defpackage.AbstractC17463l;
import defpackage.C12186l;
import defpackage.C14823l;
import defpackage.C1652l;
import defpackage.C2016l;
import defpackage.C2770l;
import defpackage.C4652l;
import defpackage.C6541l;
import defpackage.C6928l;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class VisionCommonRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        C1652l c1652lLoadAd = C4652l.loadAd(C6928l.class);
        c1652lLoadAd.yandex(new C12186l(2, 0, AbstractC17463l.class));
        c1652lLoadAd.mopub = C14823l.f29004l;
        Object[] objArr = {c1652lLoadAd.loadAd()};
        for (int i = 0; i < 1; i++) {
            C2770l c2770l = AbstractC13582l.f26598l;
            if (objArr[i] == null) {
                C6541l.subs(AbstractC0653l.vip(i, "at index "));
                return null;
            }
        }
        C2770l c2770l2 = AbstractC13582l.f26598l;
        return new C2016l(1, objArr);
    }
}
