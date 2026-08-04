package defpackage;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import ua.itaysonlab.vkxreborn.playback.service.PlaybackService;

/* JADX INFO: renamed from: lُؚّ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10995l implements InterfaceC13521l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ PlaybackService f22146l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f22147l;

    public C10995l(PlaybackService playbackService) {
        this.f22146l = playbackService;
    }

    @Override // defpackage.InterfaceC13521l
    public final void applovin(InterfaceC9814l interfaceC9814l, C3895l c3895l) {
        C4094l c4094l = c3895l.yandex;
        boolean zYandex = c4094l.yandex(7, 4);
        PlaybackService playbackService = this.f22146l;
        if (zYandex) {
            int i = PlaybackService.f36828l;
            int iPurchase = interfaceC9814l.purchase();
            EnumC11447l enumC11447l = (iPurchase == 2 || iPurchase == 3) ? interfaceC9814l.mo2758finally() ? EnumC11447l.f23032l : EnumC11447l.f23031l : EnumC11447l.f23033l;
            for (InterfaceC14762l interfaceC14762l : PlaybackService.license().f31510l) {
                int i2 = PlaybackService.f36828l;
                interfaceC14762l.loadAd(enumC11447l);
                Unit unit = Unit.INSTANCE;
            }
            AbstractC12832l.mopub(new C14759l(enumC11447l, interfaceC9814l.purchase() == 2), playbackService.f36830l);
            Handler handler = playbackService.f36837l;
            if (interfaceC9814l.purchase() != 2 && (interfaceC9814l.purchase() != 3 || !interfaceC9814l.mo2758finally())) {
                handler.removeMessages(1);
                RunnableC5360l runnableC5360l = playbackService.f36841l;
                if (runnableC5360l != null) {
                    handler.removeCallbacks(runnableC5360l);
                }
                playbackService.f36841l = null;
            } else if (playbackService.f36841l == null) {
                playbackService.isVip();
                handler.sendEmptyMessageDelayed(1, 60000L);
            }
        }
        if (c4094l.yandex(11, 1, 5)) {
            int i3 = PlaybackService.f36828l;
            playbackService.tapsense(interfaceC9814l);
        }
        if (c4094l.yandex(1)) {
            PlaybackService.ads(playbackService, interfaceC9814l);
        }
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: case */
    public final void mo2731case(C2848l c2848l) {
        this.f22147l = c2848l.crashlytics;
    }

    @Override // defpackage.InterfaceC13521l
    public final void firebase(C4262l c4262l, C4262l c4262l2, int i) {
        PlaybackService playbackService = this.f22146l;
        C18662l c18662l = playbackService.f36830l;
        InterfaceC14029l interfaceC14029l = null;
        if (c4262l.loadAd != c4262l2.loadAd) {
            if (i == 0) {
                AbstractC10999l.mopub(c18662l, null, 0, new C9798l(playbackService, c4262l2, c4262l, interfaceC14029l, 0), 3);
                return;
            } else {
                if (i != 1) {
                    return;
                }
                AbstractC10999l.mopub(c18662l, null, 0, new C9798l(playbackService, c4262l2, c4262l, interfaceC14029l, 1), 3);
                return;
            }
        }
        if (i == 1) {
            AbstractC10999l.mopub(c18662l, null, 0, new C16959l(playbackService, interfaceC14029l, 7), 3);
            Handler handler = playbackService.f36837l;
            handler.removeMessages(1);
            handler.sendEmptyMessageDelayed(1, 60000L);
        }
    }

    @Override // defpackage.InterfaceC13521l
    public final void inmobi(int i, boolean z) {
        AbstractC10999l.mopub(this.f22146l.f36830l, null, 0, new C13017l(i, this, (InterfaceC14029l) null), 3);
    }

    @Override // defpackage.InterfaceC13521l
    public final void pro(boolean z) {
        AbstractC12832l.mopub(new C12879l(z), this.f22146l.f36830l);
    }

    @Override // defpackage.InterfaceC13521l
    public final void signatures(C14723l c14723l) {
        C10507l c10507lIsPro;
        AbstractC2991l.billing(AbstractC17265l.yandex(this), 6, "Exo exception: " + c14723l.f28797l + " (" + c14723l.loadAd() + ") - " + c14723l.getMessage() + ']', null);
        c14723l.printStackTrace();
        PlaybackService playbackService = this.f22146l;
        C11644l c11644l = playbackService.f36838l;
        if (c11644l == null) {
            c11644l = null;
        }
        C2427l c2427lMo2778l = ((InterfaceC9814l) ((C9928l) c11644l.f23358l).f33215l).mo2778l();
        Object obj = (c2427lMo2778l == null || (c10507lIsPro = PlaybackService.license().f31521l.isPro(c2427lMo2778l.yandex)) == null) ? null : c10507lIsPro.loadAd;
        InterfaceC6019l interfaceC6019l = obj instanceof InterfaceC6019l ? (InterfaceC6019l) obj : null;
        if (interfaceC6019l == null || !interfaceC6019l.yandex()) {
            C11644l c11644l2 = playbackService.f36838l;
            (c11644l2 != null ? c11644l2 : null).mo2814volatile();
        } else {
            C11644l c11644l3 = playbackService.f36838l;
            (c11644l3 != null ? c11644l3 : null).mo2760goto();
        }
    }

    @Override // defpackage.InterfaceC13521l
    public final void startapp(int i, boolean z) {
        if (i == 1) {
            PlaybackService playbackService = this.f22146l;
            AbstractC10999l.mopub(playbackService.f36830l, null, 0, new C10291l(z, playbackService, (InterfaceC14029l) null, 4), 3);
        }
    }

    @Override // defpackage.InterfaceC13521l
    public final void subs(int i) {
        EnumC12501l enumC12501l;
        if (i != 0) {
            enumC12501l = i != 1 ? EnumC12501l.f24640l : EnumC12501l.f24639l;
        } else {
            enumC12501l = EnumC12501l.f24641l;
        }
        AbstractC12832l.mopub(new C7106l(enumC12501l), this.f22146l.f36830l);
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: volatile */
    public final void mo2745volatile(AbstractC10759l abstractC10759l, int i) {
        if (i == 0) {
            C2258l c2258l = PlaybackService.license().f31521l;
            int iMetrica = abstractC10759l.metrica();
            ArrayList arrayList = new ArrayList(iMetrica);
            for (int i2 = 0; i2 < iMetrica; i2++) {
                arrayList.add(abstractC10759l.remoteconfig(i2, new C4322l(), 0L).crashlytics);
            }
            C12463l c12463l = c2258l.subs;
            c12463l.billing();
            ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((C2427l) it.next()).yandex);
            }
            c12463l.crashlytics(AbstractC16901l.m4245throws(arrayList2));
            AbstractC12832l.mopub(new C1320l(PlaybackService.license().f31521l.billing()), this.f22146l.f36830l);
        }
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: native */
    public final /* synthetic */ void mo2738native() {
    }

    @Override // defpackage.InterfaceC13521l
    public final /* synthetic */ void Signature(int i) {
    }

    @Override // defpackage.InterfaceC13521l
    public final void adcel(float f) {
    }

    @Override // defpackage.InterfaceC13521l
    public final /* synthetic */ void admob(boolean z) {
    }

    @Override // defpackage.InterfaceC13521l
    public final /* synthetic */ void advert(C16684l c16684l) {
    }

    @Override // defpackage.InterfaceC13521l
    public final /* synthetic */ void appmetrica(C14723l c14723l) {
    }

    @Override // defpackage.InterfaceC13521l
    public final /* synthetic */ void billing(C15074l c15074l) {
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: catch */
    public final /* synthetic */ void mo2732catch(C1372l c1372l) {
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: else */
    public final /* synthetic */ void mo2734else(C16616l c16616l) {
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: extends */
    public final /* synthetic */ void mo2735extends(List list) {
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: interface */
    public final /* synthetic */ void mo2737interface(boolean z) {
    }

    @Override // defpackage.InterfaceC13521l
    public final /* synthetic */ void isPro(int i) {
    }

    @Override // defpackage.InterfaceC13521l
    public final /* synthetic */ void metrica(C7417l c7417l) {
    }

    @Override // defpackage.InterfaceC13521l
    public final /* synthetic */ void mopub(int i) {
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: package */
    public final /* synthetic */ void mo2739package(C3852l c3852l) {
    }

    @Override // defpackage.InterfaceC13521l
    public final /* synthetic */ void premium(C1047l c1047l) {
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: private */
    public final /* synthetic */ void mo2740private(boolean z) {
    }

    @Override // defpackage.InterfaceC13521l
    public final /* synthetic */ void remoteconfig(C4970l c4970l) {
    }

    @Override // defpackage.InterfaceC13521l
    public final /* synthetic */ void smaato(C13736l c13736l) {
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: strictfp */
    public final /* synthetic */ void mo2741strictfp(long j) {
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: switch */
    public final /* synthetic */ void mo2742switch(long j) {
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: synchronized */
    public final /* synthetic */ void mo2743synchronized(C3852l c3852l) {
    }

    @Override // defpackage.InterfaceC13521l
    public final /* synthetic */ void tapsense(int i) {
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: throws */
    public final /* synthetic */ void mo2744throws(long j) {
    }

    @Override // defpackage.InterfaceC13521l
    public final /* synthetic */ void vip(boolean z) {
    }

    @Override // defpackage.InterfaceC13521l
    public final void ads(int i, C2427l c2427l) {
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: continue */
    public final /* synthetic */ void mo2733continue(int i, int i2) {
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: for */
    public final /* synthetic */ void mo2736for(int i, boolean z) {
    }
}
