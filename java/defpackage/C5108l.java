package defpackage;

import java.util.ArrayList;
import java.util.List;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* JADX INFO: renamed from: lْؗۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5108l extends AbstractC7317l {
    public final C2391l purchase;

    public C5108l(C2391l c2391l) {
        String str = "book_" + c2391l.firebase;
        String str2 = AbstractC16901l.m4210case(c2391l.crashlytics, null, null, null, new C13206l(21), 31) + " - " + c2391l.tapsense;
        List list = c2391l.amazon;
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC14055l.subscription();
                throw null;
            }
            C6393l c6393l = (C6393l) obj;
            arrayList.add(new AudioTrack(null, i2, 0L, c6393l.billing, 0, null, false, false, null, c6393l.yandex.crashlytics, 0L, null, 0, null, null, null, null, null, null, null, false, false, false, false, null, null, 0, null, null, false, false, false, false, false, -523, 7));
            i = i2;
        }
        super(str, str2, arrayList);
        this.purchase = c2391l;
    }
}
