package defpackage;

import android.media.MediaCodecInfo;
import android.util.Range;

/* JADX INFO: renamed from: lٕۜۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15955l extends Cgoto implements InterfaceC13662l {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C4835l f31327l = new C4835l();

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final MediaCodecInfo.VideoCapabilities f31328l;

    public C15955l(MediaCodecInfo mediaCodecInfo, String str) {
        super(mediaCodecInfo, str);
        this.f31328l = ((MediaCodecInfo.CodecCapabilities) this.f833l).getVideoCapabilities();
    }

    @Override // defpackage.InterfaceC13662l
    /* JADX INFO: renamed from: default */
    public final boolean mo1969default() {
        return true;
    }

    @Override // defpackage.InterfaceC13662l
    public final boolean inmobi(int i, int i2) {
        return mo1973l(i, i2) || mo1973l(i2, i);
    }

    @Override // defpackage.InterfaceC13662l
    /* JADX INFO: renamed from: lؒۢۜ */
    public final Range mo1970l(int i) {
        try {
            return this.f31328l.getSupportedHeightsFor(i);
        } catch (Throwable th) {
            IllegalArgumentException illegalArgumentException = th instanceof IllegalArgumentException ? th : null;
            if (illegalArgumentException == null) {
                throw new IllegalArgumentException(th);
            }
            throw illegalArgumentException;
        }
    }

    @Override // defpackage.InterfaceC13662l
    /* JADX INFO: renamed from: lؔٙؕ */
    public final Range mo1971l(int i) {
        try {
            return this.f31328l.getSupportedWidthsFor(i);
        } catch (Throwable th) {
            IllegalArgumentException illegalArgumentException = th instanceof IllegalArgumentException ? th : null;
            if (illegalArgumentException == null) {
                throw new IllegalArgumentException(th);
            }
            throw illegalArgumentException;
        }
    }

    @Override // defpackage.InterfaceC13662l
    /* JADX INFO: renamed from: lًٚٔ */
    public final Range mo1972l() {
        return this.f31328l.getSupportedHeights();
    }

    @Override // defpackage.InterfaceC13662l
    /* JADX INFO: renamed from: lٔٙٝ */
    public final boolean mo1973l(int i, int i2) {
        return this.f31328l.isSizeSupported(i, i2);
    }

    @Override // defpackage.InterfaceC13662l
    /* JADX INFO: renamed from: lٍٔ۠ */
    public final int mo1974l() {
        return this.f31328l.getHeightAlignment();
    }

    @Override // defpackage.InterfaceC13662l
    /* JADX INFO: renamed from: lٕؓٗ */
    public final Range mo1975l() {
        return this.f31328l.getSupportedWidths();
    }

    @Override // defpackage.InterfaceC13662l
    /* JADX INFO: renamed from: native */
    public final int mo1976native() {
        return this.f31328l.getWidthAlignment();
    }

    @Override // defpackage.InterfaceC13662l
    /* JADX INFO: renamed from: throw */
    public final Range mo1977throw() {
        return this.f31328l.getBitrateRange();
    }
}
