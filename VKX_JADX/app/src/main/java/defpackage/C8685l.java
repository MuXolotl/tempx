package defpackage;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: renamed from: lٌَؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8685l implements InterfaceC13662l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Range f17888l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Range f17889l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC13662l f17890l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final HashSet f17891l;

    public C8685l(InterfaceC13662l interfaceC13662l) {
        this.f17890l = interfaceC13662l;
        HashSet hashSet = new HashSet();
        this.f17891l = hashSet;
        int iMo1976native = interfaceC13662l.mo1976native();
        this.f17889l = Range.create(Integer.valueOf(iMo1976native), Integer.valueOf(((int) Math.ceil(4096.0d / ((double) iMo1976native))) * iMo1976native));
        int iMo1974l = interfaceC13662l.mo1974l();
        this.f17888l = Range.create(Integer.valueOf(iMo1974l), Integer.valueOf(((int) Math.ceil(2160.0d / ((double) iMo1974l))) * iMo1974l));
        hashSet.addAll(MediaCodecInfoReportIncorrectInfoQuirk.yandex.contains(Build.MODEL.toLowerCase(Locale.US)) ? Collections.singleton(new Size(1920, 1080)) : Collections.EMPTY_SET);
    }

    @Override // defpackage.InterfaceC13662l
    /* JADX INFO: renamed from: default */
    public final boolean mo1969default() {
        return this.f17890l.mo1969default();
    }

    @Override // defpackage.InterfaceC13662l
    public final boolean inmobi(int i, int i2) {
        if (mo1973l(i, i2)) {
            return true;
        }
        return mo1969default() && mo1973l(i2, i);
    }

    @Override // defpackage.InterfaceC13662l
    /* JADX INFO: renamed from: lؒۢۜ */
    public final Range mo1970l(int i) {
        Integer numValueOf = Integer.valueOf(i);
        Range range = this.f17889l;
        boolean zContains = range.contains(numValueOf);
        InterfaceC13662l interfaceC13662l = this.f17890l;
        if (zContains && i % interfaceC13662l.mo1976native() == 0) {
            return this.f17888l;
        }
        StringBuilder sb = new StringBuilder("Not supported width: ");
        sb.append(i);
        sb.append(" which is not in ");
        sb.append(range);
        int iMo1976native = interfaceC13662l.mo1976native();
        sb.append(" or can not be divided by alignment ");
        sb.append(iMo1976native);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    @Override // defpackage.InterfaceC13662l
    /* JADX INFO: renamed from: lؔٙؕ */
    public final Range mo1971l(int i) {
        Integer numValueOf = Integer.valueOf(i);
        Range range = this.f17888l;
        boolean zContains = range.contains(numValueOf);
        InterfaceC13662l interfaceC13662l = this.f17890l;
        if (zContains && i % interfaceC13662l.mo1974l() == 0) {
            return this.f17889l;
        }
        StringBuilder sb = new StringBuilder("Not supported height: ");
        sb.append(i);
        sb.append(" which is not in ");
        sb.append(range);
        int iMo1974l = interfaceC13662l.mo1974l();
        sb.append(" or can not be divided by alignment ");
        sb.append(iMo1974l);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    @Override // defpackage.InterfaceC13662l
    /* JADX INFO: renamed from: lًٚٔ */
    public final Range mo1972l() {
        return this.f17888l;
    }

    @Override // defpackage.InterfaceC13662l
    /* JADX INFO: renamed from: lٔٙٝ */
    public final boolean mo1973l(int i, int i2) {
        InterfaceC13662l interfaceC13662l = this.f17890l;
        if (interfaceC13662l.mo1973l(i, i2)) {
            return true;
        }
        HashSet<Size> hashSet = this.f17891l;
        if (hashSet == null || !hashSet.isEmpty()) {
            for (Size size : hashSet) {
                if (size.getWidth() == i && size.getHeight() == i2) {
                    return true;
                }
            }
        }
        return this.f17889l.contains(Integer.valueOf(i)) && this.f17888l.contains(Integer.valueOf(i2)) && i % interfaceC13662l.mo1976native() == 0 && i2 % interfaceC13662l.mo1974l() == 0;
    }

    @Override // defpackage.InterfaceC13662l
    /* JADX INFO: renamed from: lٍٔ۠ */
    public final int mo1974l() {
        return this.f17890l.mo1974l();
    }

    @Override // defpackage.InterfaceC13662l
    /* JADX INFO: renamed from: lٕؓٗ */
    public final Range mo1975l() {
        return this.f17889l;
    }

    @Override // defpackage.InterfaceC13662l
    /* JADX INFO: renamed from: native */
    public final int mo1976native() {
        return this.f17890l.mo1976native();
    }

    @Override // defpackage.InterfaceC13662l
    /* JADX INFO: renamed from: throw */
    public final Range mo1977throw() {
        return this.f17890l.mo1977throw();
    }
}
