package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: lُٗۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17391l implements Iterator {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final CharSequence f33867l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f33868l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ C15053l f33869l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public String f33870l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final boolean f33872l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final AbstractC8791l f33873l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f33871l = 2;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f33874l = 0;

    public C17391l(C15053l c15053l, C8662l c8662l, CharSequence charSequence) {
        this.f33869l = c15053l;
        this.f33873l = (AbstractC8791l) c8662l.amazon;
        this.f33872l = c8662l.crashlytics;
        this.f33868l = c8662l.loadAd;
        this.f33867l = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String string;
        AbstractC8791l abstractC8791l;
        AbstractC12442l.subscription(this.f33871l != 4);
        int iInmobi = AbstractC5020l.inmobi(this.f33871l);
        if (iInmobi == 0) {
            return true;
        }
        if (iInmobi != 2) {
            this.f33871l = 4;
            int i = this.f33874l;
            while (true) {
                int length = this.f33874l;
                if (length == -1) {
                    this.f33871l = 3;
                    string = null;
                    break;
                }
                C4256l c4256l = (C4256l) this.f33869l.f29576l;
                CharSequence charSequence = this.f33867l;
                int length2 = charSequence.length();
                AbstractC12442l.startapp(length, length2);
                while (true) {
                    if (length >= length2) {
                        length = -1;
                        break;
                    }
                    if (c4256l.crashlytics(charSequence.charAt(length))) {
                        break;
                    }
                    length++;
                }
                if (length == -1) {
                    length = charSequence.length();
                    this.f33874l = -1;
                } else {
                    this.f33874l = length + 1;
                }
                int i2 = this.f33874l;
                if (i2 == i) {
                    int i3 = i2 + 1;
                    this.f33874l = i3;
                    if (i3 > charSequence.length()) {
                        this.f33874l = -1;
                    }
                } else {
                    while (true) {
                        abstractC8791l = this.f33873l;
                        if (i >= length || !abstractC8791l.crashlytics(charSequence.charAt(i))) {
                            break;
                        }
                        i++;
                    }
                    while (length > i && abstractC8791l.crashlytics(charSequence.charAt(length - 1))) {
                        length--;
                    }
                    if (!this.f33872l || i != length) {
                        int i4 = this.f33868l;
                        if (i4 == 1) {
                            length = charSequence.length();
                            this.f33874l = -1;
                            while (length > i && abstractC8791l.crashlytics(charSequence.charAt(length - 1))) {
                                length--;
                            }
                        } else {
                            this.f33868l = i4 - 1;
                        }
                        string = charSequence.subSequence(i, length).toString();
                        break;
                    }
                    i = this.f33874l;
                }
            }
            this.f33870l = string;
            if (this.f33871l != 3) {
                this.f33871l = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            C4875l.firebase();
            return null;
        }
        this.f33871l = 2;
        String str = this.f33870l;
        this.f33870l = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
