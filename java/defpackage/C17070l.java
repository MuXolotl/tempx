package defpackage;

import android.media.AudioManager;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkxreborn.playback.service.PlaybackService;

/* JADX INFO: renamed from: lِٗ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C17070l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ PlaybackService f33224l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f33225l;

    public /* synthetic */ C17070l(PlaybackService playbackService, int i) {
        this.f33225l = i;
        this.f33224l = playbackService;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f33225l;
        boolean zBooleanValue = true;
        PlaybackService playbackService = this.f33224l;
        switch (i) {
            case 0:
                C0307l c0307l = playbackService.f36842l;
                if (c0307l == null) {
                    c0307l = null;
                }
                if (c0307l.billing && AbstractC8619l.vip.yandex() == EnumC4948l.f10079l) {
                    C0307l c0307l2 = playbackService.f36842l;
                    if ((c0307l2 != null ? c0307l2 : null).purchase) {
                        zBooleanValue = ((Boolean) AbstractC8619l.metrica.yandex()).booleanValue();
                    }
                }
                return Boolean.valueOf(zBooleanValue);
            case 1:
                C0307l c0307l3 = playbackService.f36842l;
                if ((c0307l3 == null ? null : c0307l3).billing) {
                    if (!(c0307l3 != null ? c0307l3 : null).purchase) {
                        zBooleanValue = ((Boolean) AbstractC8619l.metrica.yandex()).booleanValue();
                    }
                } else {
                    zBooleanValue = (c0307l3 != null ? c0307l3 : null).purchase;
                }
                return Boolean.valueOf(zBooleanValue);
            case 2:
                int i2 = PlaybackService.f36828l;
                return new C14863l(playbackService.getApplicationContext());
            case 3:
                int i3 = PlaybackService.f36828l;
                return new C1847l(playbackService.getApplicationContext(), playbackService.getPackageManager());
            case 4:
                int i4 = PlaybackService.f36828l;
                return (AudioManager) playbackService.getSystemService("audio");
            default:
                int i5 = PlaybackService.f36828l;
                return new C13140l(playbackService.getApplicationContext(), new C3585l(0, playbackService));
        }
    }
}
