package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: lَؙٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10324l extends AbstractC14971l implements InterfaceC16031l, InterfaceC7150l {

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public LinkedHashMap f21049l;

    @Override // defpackage.InterfaceC7150l
    public final InterfaceC17792l amazon(InterfaceC7448l interfaceC7448l, InterfaceC6357l interfaceC6357l, long j) {
        float f = ((C14467l) AbstractC13402l.loadAd(this, AbstractC16434l.crashlytics)).f28331l;
        if (f < 0.0f) {
            f = 0.0f;
        }
        AbstractC10113l abstractC10113lAdcel = interfaceC6357l.adcel(j);
        int i = 1;
        boolean z = this.f29462l && !Float.isNaN(f) && C14467l.yandex(f, 0.0f) > 0;
        int iMo870l = !Float.isNaN(f) ? interfaceC7448l.mo870l(f) : 0;
        int iMax = abstractC10113lAdcel.f20592l;
        if (z) {
            iMax = Math.max(iMax, iMo870l);
        }
        int iMax2 = abstractC10113lAdcel.f20591l;
        if (z) {
            iMax2 = Math.max(iMax2, iMo870l);
        }
        if (z) {
            LinkedHashMap linkedHashMap = this.f21049l;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
                this.f21049l = linkedHashMap;
            }
            C3580l c3580l = AbstractC16434l.loadAd;
            int iRound = Math.round((iMo870l - abstractC10113lAdcel.f20592l) / 2.0f);
            if (iRound < 0) {
                iRound = 0;
            }
            linkedHashMap.put(c3580l, Integer.valueOf(iRound));
            C17857l c17857l = AbstractC16434l.yandex;
            int iRound2 = Math.round((iMo870l - abstractC10113lAdcel.f20591l) / 2.0f);
            linkedHashMap.put(c17857l, Integer.valueOf(iRound2 >= 0 ? iRound2 : 0));
        }
        Map map = this.f21049l;
        if (map == null) {
            map = C14054l.f27396l;
        }
        return interfaceC7448l.isVip(iMax, iMax2, map, new C17577l(iMax, abstractC10113lAdcel, iMax2, i));
    }

    @Override // defpackage.InterfaceC7150l
    public final /* synthetic */ int billing(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.firebase(this, abstractC11754l, interfaceC6357l, i);
    }

    @Override // defpackage.InterfaceC7150l
    public final /* synthetic */ int mopub(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.adcel(this, abstractC11754l, interfaceC6357l, i);
    }

    @Override // defpackage.InterfaceC7150l
    public final /* synthetic */ int subs(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.tapsense(this, abstractC11754l, interfaceC6357l, i);
    }

    @Override // defpackage.InterfaceC7150l
    public final /* synthetic */ int yandex(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.vip(this, abstractC11754l, interfaceC6357l, i);
    }
}
