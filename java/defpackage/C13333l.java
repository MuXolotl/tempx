package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lْْؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C13333l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f26176l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f26177l;

    public /* synthetic */ C13333l(String str, int i) {
        this.f26177l = i;
        this.f26176l = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f26177l;
        String str = this.f26176l;
        C5695l c5695l = (C5695l) obj;
        switch (i) {
            case 0:
                c5695l.loadAd(str, AbstractC14490l.loadAd);
                break;
            case 1:
                C9217l c9217l = AbstractC14490l.loadAd;
                c5695l.loadAd(str, c9217l, c9217l);
                break;
            case 2:
                C9217l c9217l2 = AbstractC14490l.loadAd;
                c5695l.yandex(str, c9217l2, c9217l2);
                break;
            case 3:
                c5695l.yandex(str, AbstractC14490l.loadAd);
                break;
            case 4:
                c5695l.yandex(str, AbstractC14490l.loadAd);
                break;
            case 5:
                c5695l.loadAd(str, AbstractC14490l.loadAd);
                break;
            default:
                c5695l.loadAd(str, AbstractC14490l.loadAd);
                break;
        }
        return Unit.INSTANCE;
    }
}
