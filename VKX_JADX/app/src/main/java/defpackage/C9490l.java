package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lٍِٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C9490l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C11663l f19375l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f19376l;

    public /* synthetic */ C9490l(C11663l c11663l, int i) {
        this.f19376l = i;
        this.f19375l = c11663l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f19376l;
        C11663l c11663l = this.f19375l;
        switch (i) {
            case 0:
                C1336l c1336l = (C1336l) obj;
                AbstractC1757l.appmetrica(c1336l, null, null, AbstractC14775l.loadAd, 3);
                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(1623475733, true, new C1350l(25, c11663l)), 3);
                AbstractC1757l.appmetrica(c1336l, null, null, AbstractC14775l.crashlytics, 3);
                AbstractC1757l.appmetrica(c1336l, null, null, AbstractC14775l.amazon, 3);
                break;
            default:
                ((Boolean) obj).getClass();
                C13530l c13530l = ((AppActivity) c11663l.isVip()).f36642l;
                C9879l c9879l = c13530l.yandex.f36642l.crashlytics;
                int i2 = AbstractC5852l.yandex;
                int i3 = AbstractC5852l.loadAd;
                C15700l c15700l = c9879l.loadAd;
                c15700l.yandex.subs(i2);
                c15700l.loadAd.subs(i3);
                c13530l.crashlytics.getClass();
                break;
        }
        return Unit.INSTANCE;
    }
}
