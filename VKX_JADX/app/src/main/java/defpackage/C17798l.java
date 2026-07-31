package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٌ٘ۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17798l implements InterfaceC11075l {
    public final Object loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C17798l(int i, Object obj) {
        this.yandex = i;
        this.loadAd = obj;
    }

    @Override // defpackage.InterfaceC11075l
    public final Iterator iterator() {
        int i = this.yandex;
        Object obj = this.loadAd;
        switch (i) {
            case 0:
                return new C11521l(1, (Object[]) obj);
            case 1:
                return ((Iterable) obj).iterator();
            case 2:
                return new C7464l(this);
            case 3:
                ArrayList arrayListAds = AbstractC17587l.ads((C14432l) obj);
                Collections.reverse(arrayListAds);
                return arrayListAds.iterator();
            case 4:
                return AbstractC6900l.purchase((Function2) obj);
            case 5:
                return new C18568l(0, obj);
            case 6:
                return new C1208l((String) obj);
            default:
                return new C17991l(this);
        }
    }
}
