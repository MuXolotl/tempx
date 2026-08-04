package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import j$.util.Objects;

/* JADX INFO: renamed from: lٗۘۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17361l extends C14723l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final C5978l f33823l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final boolean f33824l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final int f33825l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final C5019l f33826l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final int f33827l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final String f33828l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final int f33829l;

    /* JADX WARN: Illegal instructions before constructor call */
    public C17361l(int i, Exception exc, int i2, String str, int i3, C5978l c5978l, int i4, C5019l c5019l, boolean z) {
        String str2;
        int i5;
        C5978l c5978l2;
        String string;
        if (i == 0) {
            str2 = str;
            i5 = i3;
            c5978l2 = c5978l;
            string = "Source error";
        } else if (i != 1) {
            string = i != 3 ? "Unexpected runtime error" : "Remote error";
            str2 = str;
            i5 = i3;
            c5978l2 = c5978l;
        } else {
            StringBuilder sb = new StringBuilder();
            str2 = str;
            sb.append(str2);
            sb.append(" error, index=");
            i5 = i3;
            sb.append(i5);
            sb.append(", format=");
            c5978l2 = c5978l;
            sb.append(c5978l2);
            sb.append(", format_supported=");
            sb.append(AbstractC15323l.applovin(i4));
            string = sb.toString();
        }
        this(TextUtils.isEmpty(null) ? string : string.concat(": null"), exc, i2, i, str2, i5, c5978l2, i4, c5019l, SystemClock.elapsedRealtime(), z);
    }

    public final C17361l crashlytics(C5019l c5019l) {
        String message = getMessage();
        String str = AbstractC15323l.yandex;
        return new C17361l(message, getCause(), this.f28797l, this.f33825l, this.f33828l, this.f33827l, this.f33823l, this.f33829l, c5019l, this.f28796l, this.f33824l);
    }

    @Override // defpackage.C14723l
    public final boolean yandex(C14723l c14723l) {
        if (!super.yandex(c14723l)) {
            return false;
        }
        String str = AbstractC15323l.yandex;
        C17361l c17361l = (C17361l) c14723l;
        return this.f33825l == c17361l.f33825l && Objects.equals(this.f33828l, c17361l.f33828l) && this.f33827l == c17361l.f33827l && Objects.equals(this.f33823l, c17361l.f33823l) && this.f33829l == c17361l.f33829l && Objects.equals(this.f33826l, c17361l.f33826l) && this.f33824l == c17361l.f33824l;
    }

    public C17361l(String str, Throwable th, int i, int i2, String str2, int i3, C5978l c5978l, int i4, C5019l c5019l, long j, boolean z) {
        super(str, th, i, Bundle.EMPTY, j);
        AbstractC12442l.admob(!z || i2 == 1);
        AbstractC12442l.admob(th != null || i2 == 3);
        this.f33825l = i2;
        this.f33828l = str2;
        this.f33827l = i3;
        this.f33823l = c5978l;
        this.f33829l = i4;
        this.f33826l = c5019l;
        this.f33824l = z;
    }

    public C17361l(int i, Exception exc, int i2) {
        this(i, exc, i2, null, -1, null, 4, null, false);
    }
}
