package defpackage;

import android.content.Intent;
import android.content.SharedPreferences;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lٓۗۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14357l implements InterfaceC14762l {
    public Object loadAd;
    public final /* synthetic */ int yandex = 0;

    public C14357l(C16076l c16076l) {
        this.loadAd = c16076l;
    }

    @Override // defpackage.InterfaceC14762l
    public final void crashlytics(long j) {
        switch (this.yandex) {
            case 0:
                if (((AudioTrack) this.loadAd) != null) {
                    C10892l.yandex.getClass();
                    SharedPreferences sharedPreferences = AbstractC3957l.amazon;
                    if (sharedPreferences == null) {
                        sharedPreferences = null;
                    }
                    if (Integer.parseInt(sharedPreferences.getString("autocache", "0")) != 0) {
                        AudioTrack audioTrack = (AudioTrack) this.loadAd;
                        if (j >= 5000) {
                            if (!C6168l.pro(audioTrack)) {
                                SharedPreferences sharedPreferences2 = AbstractC3957l.amazon;
                                if (sharedPreferences2 == null) {
                                    sharedPreferences2 = null;
                                }
                                int i = Integer.parseInt(sharedPreferences2.getString("autocache", "0"));
                                if (i != 1) {
                                    if (i == 2) {
                                        C7268l.f15111l.getClass();
                                        C15478l.purchase.getClass();
                                        AbstractC0532l.loadAd(new C9810l(null, audioTrack, 18), null);
                                    }
                                } else if (audioTrack.getSmaato()) {
                                    C7268l.f15111l.getClass();
                                    C15478l.purchase.getClass();
                                    AbstractC0532l.loadAd(new C9810l(null, audioTrack, 18), null);
                                }
                            }
                            this.loadAd = null;
                        }
                    }
                }
                break;
        }
    }

    @Override // defpackage.InterfaceC14762l
    public final void loadAd(EnumC11447l enumC11447l) {
        int i = this.yandex;
        EnumC11447l enumC11447l2 = EnumC11447l.f23033l;
        switch (i) {
            case 0:
                if (enumC11447l == enumC11447l2) {
                    this.loadAd = null;
                }
                break;
            default:
                C16076l c16076l = (C16076l) this.loadAd;
                C2427l c2427l = (C2427l) c16076l.admob(new C18606l(c16076l, 14));
                String str = c2427l != null ? c2427l.yandex : null;
                VKXApplication vKXApplication = VKXApplication.f36631l;
                if (vKXApplication == null) {
                    vKXApplication = null;
                }
                vKXApplication.sendBroadcast(new Intent("bruhcollective.itaysonlab.libvkx.TRACK_CHANGED").putExtra("EXTRA_ID", enumC11447l != enumC11447l2 ? str : null).putExtra("EXTRA_IS_PLAYING", enumC11447l == EnumC11447l.f23032l));
                break;
        }
    }

    @Override // defpackage.InterfaceC14762l
    public final void yandex(AbstractC18643l abstractC18643l, AbstractC18643l abstractC18643l2) {
        switch (this.yandex) {
            case 0:
                if (abstractC18643l instanceof AudioTrack) {
                    AudioTrack audioTrack = (AudioTrack) this.loadAd;
                    if (audioTrack != null) {
                        AudioTrack audioTrack2 = (AudioTrack) abstractC18643l;
                        if (audioTrack2.crashlytics == audioTrack.crashlytics && audioTrack2.loadAd == audioTrack.loadAd) {
                        }
                    }
                    this.loadAd = (AudioTrack) abstractC18643l;
                    System.currentTimeMillis();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ C14357l() {
    }

    private final void amazon(long j) {
    }

    private final void purchase(AbstractC18643l abstractC18643l, AbstractC18643l abstractC18643l2) {
    }
}
