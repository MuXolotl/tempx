package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lًؐٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7699l extends AbstractC2439l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public int f16154l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f16155l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public C18128l f16156l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public C18128l f16157l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public List f16158l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public int f16159l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public int f16160l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public int f16161l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public List f16162l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f16163l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public int f16164l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f16165l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public boolean f16166l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public int f16167l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public C18128l f16168l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public int f16169l;

    public static C7699l subs() {
        C7699l c7699l = new C7699l();
        List list = Collections.EMPTY_LIST;
        c7699l.f16162l = list;
        C18128l c18128l = C18128l.f35421l;
        c7699l.f16156l = c18128l;
        c7699l.f16168l = c18128l;
        c7699l.f16157l = c18128l;
        c7699l.f16158l = list;
        return c7699l;
    }

    public final C18128l admob() {
        C18128l c18128l = new C18128l(this);
        int i = this.f16163l;
        if ((i & 1) == 1) {
            this.f16162l = DesugarCollections.unmodifiableList(this.f16162l);
            this.f16163l &= -2;
        }
        c18128l.f35434l = this.f16162l;
        int i2 = (i & 2) != 2 ? 0 : 1;
        c18128l.f35433l = this.f16166l;
        if ((i & 4) == 4) {
            i2 |= 2;
        }
        c18128l.f35437l = this.f16155l;
        if ((i & 8) == 8) {
            i2 |= 4;
        }
        c18128l.f35424l = this.f16156l;
        if ((i & 16) == 16) {
            i2 |= 8;
        }
        c18128l.f35426l = this.f16165l;
        if ((i & 32) == 32) {
            i2 |= 16;
        }
        c18128l.f35436l = this.f16160l;
        if ((i & 64) == 64) {
            i2 |= 32;
        }
        c18128l.f35431l = this.f16167l;
        if ((i & 128) == 128) {
            i2 |= 64;
        }
        c18128l.f35438l = this.f16164l;
        if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            i2 |= 128;
        }
        c18128l.f35435l = this.f16154l;
        if ((i & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) == 512) {
            i2 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        c18128l.f35422l = this.f16168l;
        if ((i & 1024) == 1024) {
            i2 |= AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
        }
        c18128l.f35439l = this.f16161l;
        if ((i & 2048) == 2048) {
            i2 |= 1024;
        }
        c18128l.f35432l = this.f16157l;
        if ((i & 4096) == 4096) {
            i2 |= 2048;
        }
        c18128l.f35427l = this.f16159l;
        if ((i & 8192) == 8192) {
            i2 |= 4096;
        }
        c18128l.f35430l = this.f16169l;
        if ((this.f16163l & 16384) == 16384) {
            this.f16158l = DesugarCollections.unmodifiableList(this.f16158l);
            this.f16163l &= -16385;
        }
        c18128l.f35440l = this.f16158l;
        c18128l.f35423l = i2;
        return c18128l;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // defpackage.AbstractC2398l
    public final AbstractC2398l amazon(C1718l c1718l, C3429l c3429l) throws Throwable {
        C18128l c18128l = null;
        try {
            try {
                C18128l.f35420l.getClass();
                isPro(new C18128l(c1718l, c3429l));
                return this;
            } catch (Throwable th) {
                th = th;
                if (c18128l != null) {
                    isPro(c18128l);
                }
                throw th;
            }
        } catch (C12383l e) {
            C18128l c18128l2 = (C18128l) e.f24472l;
            try {
                throw e;
            } catch (Throwable th2) {
                th = th2;
                c18128l = c18128l2;
                if (c18128l != null) {
                    isPro(c18128l);
                }
                throw th;
            }
        }
    }

    public final Object clone() {
        C7699l c7699lSubs = subs();
        c7699lSubs.isPro(admob());
        return c7699lSubs;
    }

    @Override // defpackage.AbstractC2398l
    public final AbstractC14080l crashlytics() {
        C18128l c18128lAdmob = admob();
        if (c18128lAdmob.yandex()) {
            return c18128lAdmob;
        }
        throw new C6451l();
    }

    public final C7699l isPro(C18128l c18128l) {
        C18128l c18128l2;
        C18128l c18128l3;
        C18128l c18128l4;
        C18128l c18128l5 = C18128l.f35421l;
        if (c18128l == c18128l5) {
            return this;
        }
        if (!c18128l.f35434l.isEmpty()) {
            if (this.f16162l.isEmpty()) {
                this.f16162l = c18128l.f35434l;
                this.f16163l &= -2;
            } else {
                if ((this.f16163l & 1) != 1) {
                    this.f16162l = new ArrayList(this.f16162l);
                    this.f16163l |= 1;
                }
                this.f16162l.addAll(c18128l.f35434l);
            }
        }
        int i = c18128l.f35423l;
        if ((i & 1) == 1) {
            boolean z = c18128l.f35433l;
            this.f16163l |= 2;
            this.f16166l = z;
        }
        if ((i & 2) == 2) {
            int i2 = c18128l.f35437l;
            this.f16163l |= 4;
            this.f16155l = i2;
        }
        if ((i & 4) == 4) {
            C18128l c18128l6 = c18128l.f35424l;
            if ((this.f16163l & 8) != 8 || (c18128l4 = this.f16156l) == c18128l5) {
                this.f16156l = c18128l6;
            } else {
                C7699l c7699lAds = C18128l.ads(c18128l4);
                c7699lAds.isPro(c18128l6);
                this.f16156l = c7699lAds.admob();
            }
            this.f16163l |= 8;
        }
        if ((c18128l.f35423l & 8) == 8) {
            int i3 = c18128l.f35426l;
            this.f16163l |= 16;
            this.f16165l = i3;
        }
        if (c18128l.startapp()) {
            int i4 = c18128l.f35436l;
            this.f16163l |= 32;
            this.f16160l = i4;
        }
        int i5 = c18128l.f35423l;
        if ((i5 & 32) == 32) {
            int i6 = c18128l.f35431l;
            this.f16163l |= 64;
            this.f16167l = i6;
        }
        if ((i5 & 64) == 64) {
            int i7 = c18128l.f35438l;
            this.f16163l |= 128;
            this.f16164l = i7;
        }
        if ((i5 & 128) == 128) {
            int i8 = c18128l.f35435l;
            this.f16163l |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            this.f16154l = i8;
        }
        if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            C18128l c18128l7 = c18128l.f35422l;
            if ((this.f16163l & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 512 || (c18128l3 = this.f16168l) == c18128l5) {
                this.f16168l = c18128l7;
            } else {
                C7699l c7699lAds2 = C18128l.ads(c18128l3);
                c7699lAds2.isPro(c18128l7);
                this.f16168l = c7699lAds2.admob();
            }
            this.f16163l |= AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
        }
        int i9 = c18128l.f35423l;
        if ((i9 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) == 512) {
            int i10 = c18128l.f35439l;
            this.f16163l |= 1024;
            this.f16161l = i10;
        }
        if ((i9 & 1024) == 1024) {
            C18128l c18128l8 = c18128l.f35432l;
            if ((this.f16163l & 2048) != 2048 || (c18128l2 = this.f16157l) == c18128l5) {
                this.f16157l = c18128l8;
            } else {
                C7699l c7699lAds3 = C18128l.ads(c18128l2);
                c7699lAds3.isPro(c18128l8);
                this.f16157l = c7699lAds3.admob();
            }
            this.f16163l |= 2048;
        }
        int i11 = c18128l.f35423l;
        if ((i11 & 2048) == 2048) {
            int i12 = c18128l.f35427l;
            this.f16163l |= 4096;
            this.f16159l = i12;
        }
        if ((i11 & 4096) == 4096) {
            int i13 = c18128l.f35430l;
            this.f16163l |= 8192;
            this.f16169l = i13;
        }
        if (!c18128l.f35440l.isEmpty()) {
            if (this.f16158l.isEmpty()) {
                this.f16158l = c18128l.f35440l;
                this.f16163l &= -16385;
            } else {
                if ((this.f16163l & 16384) != 16384) {
                    this.f16158l = new ArrayList(this.f16158l);
                    this.f16163l |= 16384;
                }
                this.f16158l.addAll(c18128l.f35440l);
            }
        }
        billing(c18128l);
        this.f5168l = this.f5168l.billing(c18128l.f35428l);
        return this;
    }

    @Override // defpackage.AbstractC2398l
    public final /* bridge */ /* synthetic */ AbstractC2398l purchase(AbstractC4730l abstractC4730l) {
        isPro((C18128l) abstractC4730l);
        return this;
    }
}
