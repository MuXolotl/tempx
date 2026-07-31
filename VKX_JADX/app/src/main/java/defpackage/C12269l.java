package defpackage;

import android.media.audiofx.AudioEffect;
import android.media.audiofx.BassBoost;
import android.media.audiofx.EnvironmentalReverb;

/* JADX INFO: renamed from: lِۨؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12269l implements InterfaceC11209l {
    public AudioEffect loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C12269l(int i) {
        this.yandex = i;
    }

    @Override // defpackage.InterfaceC11209l
    public final boolean loadAd(C3597l c3597l) {
        switch (this.yandex) {
            case 0:
                BassBoost bassBoost = (BassBoost) this.loadAd;
                if (bassBoost != null) {
                    C15744l c15744lCrashlytics = c3597l.f7529l;
                    if (c15744lCrashlytics == null) {
                        c15744lCrashlytics = C18454l.crashlytics();
                    }
                    bassBoost.setEnabled(c15744lCrashlytics.f30927l);
                    bassBoost.setStrength((short) AbstractC8576l.billing((int) (c15744lCrashlytics.f30926l * 10.0f), new C8934l(0, 1000, 1)));
                }
                break;
            default:
                EnvironmentalReverb environmentalReverb = (EnvironmentalReverb) this.loadAd;
                if (environmentalReverb != null) {
                    C15744l c15744lCrashlytics2 = c3597l.f7533l;
                    if (c15744lCrashlytics2 == null) {
                        c15744lCrashlytics2 = C18454l.crashlytics();
                    }
                    environmentalReverb.setEnabled(c15744lCrashlytics2.f30927l);
                    float fFloatValue = ((Number) AbstractC8576l.admob(Float.valueOf(c15744lCrashlytics2.f30926l), new C12015l(0.0f, 1.0f))).floatValue() * (-1000.0f);
                    short s = (short) fFloatValue;
                    environmentalReverb.setRoomLevel(s);
                    environmentalReverb.setReflectionsLevel(s);
                    environmentalReverb.setDecayTime((int) (Math.abs(fFloatValue) + 500.0f));
                }
                break;
        }
        return false;
    }

    @Override // defpackage.InterfaceC11209l
    public final void release() {
        switch (this.yandex) {
            case 0:
                BassBoost bassBoost = (BassBoost) this.loadAd;
                if (bassBoost != null) {
                    bassBoost.release();
                }
                this.loadAd = null;
                break;
            default:
                EnvironmentalReverb environmentalReverb = (EnvironmentalReverb) this.loadAd;
                if (environmentalReverb != null) {
                    environmentalReverb.release();
                }
                this.loadAd = null;
                break;
        }
    }

    @Override // defpackage.InterfaceC11209l
    public final void yandex(int i, C3597l c3597l) {
        switch (this.yandex) {
            case 0:
                this.loadAd = new BassBoost(100, i);
                loadAd(c3597l);
                break;
            default:
                this.loadAd = new EnvironmentalReverb(100, i);
                loadAd(c3597l);
                break;
        }
    }
}
