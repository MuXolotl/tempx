package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؘِۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5622l extends AbstractC2439l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public List f11967l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public List f11968l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public C18128l f11969l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public C18128l f11970l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f11971l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f11972l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public List f11973l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f11974l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f11975l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public int f11976l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public List f11977l;

    public static C5622l subs() {
        C5622l c5622l = new C5622l();
        c5622l.f11971l = 6;
        List list = Collections.EMPTY_LIST;
        c5622l.f11968l = list;
        C18128l c18128l = C18128l.f35421l;
        c5622l.f11969l = c18128l;
        c5622l.f11970l = c18128l;
        c5622l.f11973l = list;
        c5622l.f11967l = list;
        c5622l.f11977l = list;
        return c5622l;
    }

    public final C1512l admob() {
        C1512l c1512l = new C1512l(this);
        int i = this.f11972l;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c1512l.f3776l = this.f11971l;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c1512l.f3775l = this.f11975l;
        if ((i & 4) == 4) {
            this.f11968l = DesugarCollections.unmodifiableList(this.f11968l);
            this.f11972l &= -5;
        }
        c1512l.f3779l = this.f11968l;
        if ((i & 8) == 8) {
            i2 |= 4;
        }
        c1512l.f3770l = this.f11969l;
        if ((i & 16) == 16) {
            i2 |= 8;
        }
        c1512l.f3771l = this.f11974l;
        if ((i & 32) == 32) {
            i2 |= 16;
        }
        c1512l.f3778l = this.f11970l;
        if ((i & 64) == 64) {
            i2 |= 32;
        }
        c1512l.f3773l = this.f11976l;
        if ((this.f11972l & 128) == 128) {
            this.f11973l = DesugarCollections.unmodifiableList(this.f11973l);
            this.f11972l &= -129;
        }
        c1512l.f3780l = this.f11973l;
        if ((this.f11972l & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            this.f11967l = DesugarCollections.unmodifiableList(this.f11967l);
            this.f11972l &= -257;
        }
        c1512l.f3777l = this.f11967l;
        if ((this.f11972l & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) == 512) {
            this.f11977l = DesugarCollections.unmodifiableList(this.f11977l);
            this.f11972l &= -513;
        }
        c1512l.f3768l = this.f11977l;
        c1512l.f3769l = i2;
        return c1512l;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // defpackage.AbstractC2398l
    public final AbstractC2398l amazon(C1718l c1718l, C3429l c3429l) throws Throwable {
        C1512l c1512l = null;
        try {
            try {
                C1512l.f3767l.getClass();
                isPro(new C1512l(c1718l, c3429l));
                return this;
            } catch (Throwable th) {
                th = th;
                if (c1512l != null) {
                    isPro(c1512l);
                }
                throw th;
            }
        } catch (C12383l e) {
            C1512l c1512l2 = (C1512l) e.f24472l;
            try {
                throw e;
            } catch (Throwable th2) {
                th = th2;
                c1512l = c1512l2;
                if (c1512l != null) {
                    isPro(c1512l);
                }
                throw th;
            }
        }
    }

    public final Object clone() {
        C5622l c5622lSubs = subs();
        c5622lSubs.isPro(admob());
        return c5622lSubs;
    }

    @Override // defpackage.AbstractC2398l
    public final AbstractC14080l crashlytics() {
        C1512l c1512lAdmob = admob();
        if (c1512lAdmob.yandex()) {
            return c1512lAdmob;
        }
        throw new C6451l();
    }

    public final void isPro(C1512l c1512l) {
        C18128l c18128l;
        C18128l c18128l2;
        if (c1512l == C1512l.f3766l) {
            return;
        }
        int i = c1512l.f3769l;
        if ((i & 1) == 1) {
            int i2 = c1512l.f3776l;
            this.f11972l = 1 | this.f11972l;
            this.f11971l = i2;
        }
        if ((i & 2) == 2) {
            int i3 = c1512l.f3775l;
            this.f11972l = 2 | this.f11972l;
            this.f11975l = i3;
        }
        if (!c1512l.f3779l.isEmpty()) {
            if (this.f11968l.isEmpty()) {
                this.f11968l = c1512l.f3779l;
                this.f11972l &= -5;
            } else {
                if ((this.f11972l & 4) != 4) {
                    this.f11968l = new ArrayList(this.f11968l);
                    this.f11972l |= 4;
                }
                this.f11968l.addAll(c1512l.f3779l);
            }
        }
        if ((c1512l.f3769l & 4) == 4) {
            C18128l c18128l3 = c1512l.f3770l;
            if ((this.f11972l & 8) != 8 || (c18128l2 = this.f11969l) == C18128l.f35421l) {
                this.f11969l = c18128l3;
            } else {
                C7699l c7699lAds = C18128l.ads(c18128l2);
                c7699lAds.isPro(c18128l3);
                this.f11969l = c7699lAds.admob();
            }
            this.f11972l |= 8;
        }
        int i4 = c1512l.f3769l;
        if ((i4 & 8) == 8) {
            int i5 = c1512l.f3771l;
            this.f11972l |= 16;
            this.f11974l = i5;
        }
        if ((i4 & 16) == 16) {
            C18128l c18128l4 = c1512l.f3778l;
            if ((this.f11972l & 32) != 32 || (c18128l = this.f11970l) == C18128l.f35421l) {
                this.f11970l = c18128l4;
            } else {
                C7699l c7699lAds2 = C18128l.ads(c18128l);
                c7699lAds2.isPro(c18128l4);
                this.f11970l = c7699lAds2.admob();
            }
            this.f11972l |= 32;
        }
        if ((c1512l.f3769l & 32) == 32) {
            int i6 = c1512l.f3773l;
            this.f11972l |= 64;
            this.f11976l = i6;
        }
        if (!c1512l.f3780l.isEmpty()) {
            if (this.f11973l.isEmpty()) {
                this.f11973l = c1512l.f3780l;
                this.f11972l &= -129;
            } else {
                if ((this.f11972l & 128) != 128) {
                    this.f11973l = new ArrayList(this.f11973l);
                    this.f11972l |= 128;
                }
                this.f11973l.addAll(c1512l.f3780l);
            }
        }
        if (!c1512l.f3777l.isEmpty()) {
            if (this.f11967l.isEmpty()) {
                this.f11967l = c1512l.f3777l;
                this.f11972l &= -257;
            } else {
                if ((this.f11972l & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 256) {
                    this.f11967l = new ArrayList(this.f11967l);
                    this.f11972l |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                }
                this.f11967l.addAll(c1512l.f3777l);
            }
        }
        if (!c1512l.f3768l.isEmpty()) {
            if (this.f11977l.isEmpty()) {
                this.f11977l = c1512l.f3768l;
                this.f11972l &= -513;
            } else {
                if ((this.f11972l & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 512) {
                    this.f11977l = new ArrayList(this.f11977l);
                    this.f11972l |= AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
                }
                this.f11977l.addAll(c1512l.f3768l);
            }
        }
        billing(c1512l);
        this.f5168l = this.f5168l.billing(c1512l.f3772l);
    }

    @Override // defpackage.AbstractC2398l
    public final /* bridge */ /* synthetic */ AbstractC2398l purchase(AbstractC4730l abstractC4730l) {
        isPro((C1512l) abstractC4730l);
        return this;
    }
}
