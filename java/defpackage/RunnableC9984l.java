package defpackage;

import android.os.Bundle;
import android.os.Messenger;
import android.text.TextUtils;

/* JADX INFO: renamed from: lٍۨۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9984l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ String f20381l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C15053l f20382l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f20383l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ C1102l f20384l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Bundle f20385l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C5008l f20386l;

    public /* synthetic */ RunnableC9984l(C5008l c5008l, C15053l c15053l, String str, Bundle bundle, C1102l c1102l, int i) {
        this.f20383l = i;
        this.f20386l = c5008l;
        this.f20382l = c15053l;
        this.f20381l = str;
        this.f20385l = bundle;
        this.f20384l = c1102l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f20383l;
        C1102l c1102l = this.f20384l;
        String str = this.f20381l;
        C5008l c5008l = this.f20386l;
        C15053l c15053l = this.f20382l;
        switch (i) {
            case 0:
                C7996l c7996l = (C7996l) ((ServiceC16415l) c5008l.f10245l).f32110l.get(((Messenger) c15053l.f29576l).getBinder());
                if (c7996l != null) {
                    ServiceC16415l serviceC16415l = (ServiceC16415l) c5008l.f10245l;
                    String str2 = this.f20381l;
                    C18689l c18689l = new C18689l(str2, c1102l, 1);
                    serviceC16415l.f32114l = c7996l;
                    C6499l c6499lLoadAd = serviceC16415l.loadAd();
                    if (c6499lLoadAd == null) {
                        c18689l.billing(null);
                    } else if (TextUtils.isEmpty(str2)) {
                        AbstractC6427l.vip("MLSLegacyStub", "Ignoring empty query from " + c6499lLoadAd);
                        c18689l.billing(null);
                    } else if (c6499lLoadAd.amazon instanceof C17947l) {
                        c18689l.yandex();
                        AbstractC15323l.m3966final(serviceC16415l.f32112l.smaato, new RunnableC0295l(serviceC16415l, c6499lLoadAd, c18689l, str2, this.f20385l));
                    }
                    serviceC16415l.f32114l = null;
                    if (!c18689l.loadAd()) {
                        C8339l.smaato(AbstractC14814l.startapp("onSearch must call detach() or sendResult() before returning for query=", str2));
                        break;
                    }
                } else {
                    AbstractC6427l.vip("MBServiceCompat", "search for callback that isn't registered query=" + str);
                    break;
                }
                break;
            default:
                C7996l c7996l2 = (C7996l) ((ServiceC16415l) c5008l.f10245l).f32110l.get(((Messenger) c15053l.f29576l).getBinder());
                Bundle bundle = this.f20385l;
                if (c7996l2 != null) {
                    ServiceC16415l serviceC16415l2 = (ServiceC16415l) c5008l.f10245l;
                    String str3 = this.f20381l;
                    C18689l c18689l2 = new C18689l(str3, c1102l, 2);
                    serviceC16415l2.f32114l = c7996l2;
                    Bundle bundle2 = bundle == null ? Bundle.EMPTY : bundle;
                    C6499l c6499lLoadAd2 = serviceC16415l2.loadAd();
                    if (c6499lLoadAd2 == null) {
                        c18689l2.purchase();
                    } else {
                        c18689l2.yandex();
                        AbstractC15323l.m3966final(serviceC16415l2.f32112l.smaato, new RunnableC0295l((Object) serviceC16415l2, str3, (Object) c6499lLoadAd2, (Object) c18689l2, (Object) bundle2, 5));
                    }
                    serviceC16415l2.f32114l = null;
                    if (!c18689l2.loadAd()) {
                        C18073l.metrica("onCustomAction must call detach() or sendResult() or sendError() before returning for action=", str3, " extras=", bundle);
                        break;
                    }
                } else {
                    AbstractC6427l.vip("MBServiceCompat", "sendCustomAction for callback that isn't registered action=" + str + ", extras=" + bundle);
                    break;
                }
                break;
        }
    }
}
