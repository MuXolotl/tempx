package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؑٛؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0423l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final String f1536l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f1537l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f1538l;

    public /* synthetic */ C0423l(String str, int i, String str2) {
        this.f1538l = i;
        this.f1537l = str;
        this.f1536l = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f1538l;
        String str = this.f1536l;
        String str2 = this.f1537l;
        C5695l c5695l = (C5695l) obj;
        switch (i) {
            case 0:
                C9217l c9217l = AbstractC14490l.loadAd;
                c5695l.yandex(str2, c9217l);
                C9217l c9217l2 = AbstractC14490l.yandex;
                c5695l.yandex(str, c9217l, c9217l, c9217l2, c9217l2);
                c5695l.loadAd(str2, c9217l2);
                break;
            case 1:
                C9217l c9217l3 = AbstractC14490l.loadAd;
                c5695l.yandex(str2, c9217l3);
                c5695l.yandex(str, c9217l3, c9217l3, c9217l3);
                c5695l.loadAd(str2, c9217l3);
                break;
            case 2:
                C9217l c9217l4 = AbstractC14490l.loadAd;
                c5695l.yandex(str2, c9217l4);
                C9217l c9217l5 = AbstractC14490l.yandex;
                c5695l.yandex(str, c9217l4, c9217l4, AbstractC14490l.crashlytics, c9217l5);
                c5695l.loadAd(str2, c9217l5);
                break;
            case 3:
                C9217l c9217l6 = AbstractC14490l.loadAd;
                c5695l.yandex(str2, c9217l6);
                C9217l c9217l7 = AbstractC14490l.crashlytics;
                c5695l.yandex(str2, c9217l7);
                C9217l c9217l8 = AbstractC14490l.yandex;
                c5695l.yandex(str, c9217l6, c9217l7, c9217l7, c9217l8);
                c5695l.loadAd(str2, c9217l8);
                break;
            case 4:
                C9217l c9217l9 = AbstractC14490l.crashlytics;
                c5695l.yandex(str2, c9217l9);
                c5695l.loadAd(str, AbstractC14490l.loadAd, c9217l9);
                break;
            default:
                c5695l.yandex(str2, AbstractC14490l.yandex);
                c5695l.loadAd(str, AbstractC14490l.loadAd, AbstractC14490l.crashlytics);
                break;
        }
        return Unit.INSTANCE;
    }
}
