package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؙّٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C12433l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C13220l f24545l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f24546l;

    public /* synthetic */ C12433l(C13220l c13220l, int i) {
        this.f24546l = i;
        this.f24545l = c13220l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f24546l;
        C13220l c13220l = this.f24545l;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                C11560l c11560l = c13220l.f30818l;
                (c11560l != null ? c11560l : null).setCurrentItem(iIntValue, true);
                break;
            case 1:
                C1008l c1008l = c13220l.f25999l;
                c1008l.getClass();
                c1008l.remoteconfig(null, "");
                c13220l.f26001l.smaato((String) obj);
                c13220l.f26002l.mo782this();
                break;
            default:
                String str = (String) obj;
                if (!AbstractC12024l.m3315catch(str)) {
                    C5663l.f12024l.getClass();
                    C5663l.loadAd(str);
                }
                c13220l.m3621instanceof(str, false);
                break;
        }
        return Unit.INSTANCE;
    }
}
