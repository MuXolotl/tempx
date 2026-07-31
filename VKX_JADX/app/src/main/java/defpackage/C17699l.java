package defpackage;

import android.util.Size;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: lً٘ؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C17699l implements InterfaceC1837l {
    public final /* synthetic */ Object crashlytics;
    public final /* synthetic */ AbstractC6896l loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C17699l(AbstractC6896l abstractC6896l, Object obj, int i) {
        this.yandex = i;
        this.loadAd = abstractC6896l;
        this.crashlytics = obj;
    }

    @Override // defpackage.InterfaceC1837l
    public final void yandex(C10814l c10814l) {
        int i = this.yandex;
        Object obj = this.crashlytics;
        AbstractC6896l abstractC6896l = this.loadAd;
        switch (i) {
            case 0:
                C9585l c9585l = (C9585l) abstractC6896l;
                AbstractC13871l abstractC13871l = (AbstractC13871l) obj;
                if (c9585l.amazon() != null) {
                    AbstractC12225l.crashlytics();
                    C2525l c2525l = c9585l.signatures;
                    if (c2525l != null) {
                        c2525l.loadAd();
                        c9585l.signatures = null;
                    }
                    C5571l c5571l = c9585l.isVip;
                    if (c5571l != null) {
                        c5571l.yandex();
                        c9585l.isVip = null;
                    }
                    abstractC13871l.crashlytics();
                    c9585l.billing();
                    C16506l c16506l = (C16506l) c9585l.admob;
                    C5464l c5464l = c9585l.subs;
                    c5464l.getClass();
                    C16774l c16774lM2694synchronized = c9585l.m2694synchronized(c16506l, c5464l);
                    c9585l.advert = c16774lM2694synchronized;
                    Object[] objArr = {c16774lM2694synchronized.crashlytics()};
                    ArrayList arrayList = new ArrayList(1);
                    Object obj2 = objArr[0];
                    Objects.requireNonNull(obj2);
                    arrayList.add(obj2);
                    c9585l.m2081throws(DesugarCollections.unmodifiableList(arrayList));
                    c9585l.adcel();
                    break;
                }
                break;
            default:
                C16005l c16005l = (C16005l) abstractC6896l;
                c16005l.m2081throws(Collections.singletonList(c16005l.m4126strictfp((Size) obj).crashlytics()));
                c16005l.adcel();
                break;
        }
    }
}
