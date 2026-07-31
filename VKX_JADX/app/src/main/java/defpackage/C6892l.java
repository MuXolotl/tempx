package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import j$.util.Objects;

/* JADX INFO: renamed from: lؙۦ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C6892l extends C17815l {
    public C6892l(C1473l c1473l, WindowInsets windowInsets) {
        super(c1473l, windowInsets);
    }

    @Override // defpackage.C17212l
    public C17518l admob() {
        DisplayCutout displayCutout = this.crashlytics.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C17518l(displayCutout);
    }

    @Override // defpackage.C3521l, defpackage.C17212l
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6892l)) {
            return false;
        }
        C6892l c6892l = (C6892l) obj;
        return Objects.equals(this.crashlytics, c6892l.crashlytics) && Objects.equals(this.mopub, c6892l.mopub) && C3521l.m1347extends(this.admob, c6892l.admob);
    }

    @Override // defpackage.C17212l
    public int hashCode() {
        return this.crashlytics.hashCode();
    }

    @Override // defpackage.C17212l
    public C1473l yandex() {
        return C1473l.admob(this.crashlytics.consumeDisplayCutout(), null);
    }

    public C6892l(C1473l c1473l, C6892l c6892l) {
        super(c1473l, c6892l);
    }
}
