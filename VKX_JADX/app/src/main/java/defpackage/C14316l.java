package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٓٞۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14316l extends AbstractC2439l {

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public List f28023l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public List f28024l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f28025l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public List f28026l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public List f28027l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public C18128l f28028l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public List f28029l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public C15743l f28030l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public C3647l f28031l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public List f28032l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public List f28033l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f28034l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f28035l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public int f28036l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f28037l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f28038l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public C18128l f28039l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public List f28040l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public List f28041l;

    public static C14316l subs() {
        C14316l c14316l = new C14316l();
        c14316l.f28034l = 6;
        c14316l.f28038l = 6;
        C18128l c18128l = C18128l.f35421l;
        c14316l.f28028l = c18128l;
        List list = Collections.EMPTY_LIST;
        c14316l.f28032l = list;
        c14316l.f28039l = c18128l;
        c14316l.f28024l = list;
        c14316l.f28040l = list;
        c14316l.f28033l = list;
        c14316l.f28029l = list;
        c14316l.f28031l = C3647l.f7625l;
        c14316l.f28041l = list;
        c14316l.f28030l = C15743l.f30919l;
        c14316l.f28027l = list;
        c14316l.f28026l = list;
        c14316l.f28023l = list;
        return c14316l;
    }

    public final C14036l admob() {
        C14036l c14036l = new C14036l(this);
        int i = this.f28035l;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c14036l.f27371l = this.f28034l;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c14036l.f27370l = this.f28038l;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        c14036l.f27374l = this.f28025l;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        c14036l.f27359l = this.f28028l;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        c14036l.f27362l = this.f28037l;
        if ((i & 32) == 32) {
            this.f28032l = DesugarCollections.unmodifiableList(this.f28032l);
            this.f28035l &= -33;
        }
        c14036l.f27373l = this.f28032l;
        if ((i & 64) == 64) {
            i2 |= 32;
        }
        c14036l.f27368l = this.f28039l;
        if ((i & 128) == 128) {
            i2 |= 64;
        }
        c14036l.f27375l = this.f28036l;
        if ((this.f28035l & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            this.f28024l = DesugarCollections.unmodifiableList(this.f28024l);
            this.f28035l &= -257;
        }
        c14036l.f27372l = this.f28024l;
        if ((this.f28035l & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) == 512) {
            this.f28040l = DesugarCollections.unmodifiableList(this.f28040l);
            this.f28035l &= -513;
        }
        c14036l.f27357l = this.f28040l;
        if ((this.f28035l & 1024) == 1024) {
            this.f28033l = DesugarCollections.unmodifiableList(this.f28033l);
            this.f28035l &= -1025;
        }
        c14036l.f27369l = this.f28033l;
        if ((this.f28035l & 2048) == 2048) {
            this.f28029l = DesugarCollections.unmodifiableList(this.f28029l);
            this.f28035l &= -2049;
        }
        c14036l.f27363l = this.f28029l;
        if ((i & 4096) == 4096) {
            i2 |= 128;
        }
        c14036l.f27367l = this.f28031l;
        if ((this.f28035l & 8192) == 8192) {
            this.f28041l = DesugarCollections.unmodifiableList(this.f28041l);
            this.f28035l &= -8193;
        }
        c14036l.f27377l = this.f28041l;
        if ((i & 16384) == 16384) {
            i2 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        c14036l.f27366l = this.f28030l;
        if ((this.f28035l & 32768) == 32768) {
            this.f28027l = DesugarCollections.unmodifiableList(this.f28027l);
            this.f28035l &= -32769;
        }
        c14036l.f27361l = this.f28027l;
        if ((this.f28035l & 65536) == 65536) {
            this.f28026l = DesugarCollections.unmodifiableList(this.f28026l);
            this.f28035l &= -65537;
        }
        c14036l.f27360l = this.f28026l;
        if ((this.f28035l & 131072) == 131072) {
            this.f28023l = DesugarCollections.unmodifiableList(this.f28023l);
            this.f28035l &= -131073;
        }
        c14036l.f27356l = this.f28023l;
        c14036l.f27358l = i2;
        return c14036l;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // defpackage.AbstractC2398l
    public final AbstractC2398l amazon(C1718l c1718l, C3429l c3429l) throws Throwable {
        C14036l c14036l = null;
        try {
            try {
                C14036l.f27355l.getClass();
                isPro(new C14036l(c1718l, c3429l));
                return this;
            } catch (Throwable th) {
                th = th;
                if (c14036l != null) {
                    isPro(c14036l);
                }
                throw th;
            }
        } catch (C12383l e) {
            C14036l c14036l2 = (C14036l) e.f24472l;
            try {
                throw e;
            } catch (Throwable th2) {
                th = th2;
                c14036l = c14036l2;
                if (c14036l != null) {
                    isPro(c14036l);
                }
                throw th;
            }
        }
    }

    public final Object clone() {
        C14316l c14316lSubs = subs();
        c14316lSubs.isPro(admob());
        return c14316lSubs;
    }

    @Override // defpackage.AbstractC2398l
    public final AbstractC14080l crashlytics() {
        C14036l c14036lAdmob = admob();
        if (c14036lAdmob.yandex()) {
            return c14036lAdmob;
        }
        throw new C6451l();
    }

    public final void isPro(C14036l c14036l) {
        C15743l c15743l;
        C3647l c3647l;
        C18128l c18128l;
        C18128l c18128l2;
        if (c14036l == C14036l.f27354l) {
            return;
        }
        int i = c14036l.f27358l;
        if ((i & 1) == 1) {
            int i2 = c14036l.f27371l;
            this.f28035l = 1 | this.f28035l;
            this.f28034l = i2;
        }
        if ((i & 2) == 2) {
            int i3 = c14036l.f27370l;
            this.f28035l = 2 | this.f28035l;
            this.f28038l = i3;
        }
        if ((i & 4) == 4) {
            int i4 = c14036l.f27374l;
            this.f28035l = 4 | this.f28035l;
            this.f28025l = i4;
        }
        if ((i & 8) == 8) {
            C18128l c18128l3 = c14036l.f27359l;
            if ((this.f28035l & 8) != 8 || (c18128l2 = this.f28028l) == C18128l.f35421l) {
                this.f28028l = c18128l3;
            } else {
                C7699l c7699lAds = C18128l.ads(c18128l2);
                c7699lAds.isPro(c18128l3);
                this.f28028l = c7699lAds.admob();
            }
            this.f28035l |= 8;
        }
        if ((c14036l.f27358l & 16) == 16) {
            int i5 = c14036l.f27362l;
            this.f28035l = 16 | this.f28035l;
            this.f28037l = i5;
        }
        if (!c14036l.f27373l.isEmpty()) {
            if (this.f28032l.isEmpty()) {
                this.f28032l = c14036l.f27373l;
                this.f28035l &= -33;
            } else {
                if ((this.f28035l & 32) != 32) {
                    this.f28032l = new ArrayList(this.f28032l);
                    this.f28035l |= 32;
                }
                this.f28032l.addAll(c14036l.f27373l);
            }
        }
        if ((c14036l.f27358l & 32) == 32) {
            C18128l c18128l4 = c14036l.f27368l;
            if ((this.f28035l & 64) != 64 || (c18128l = this.f28039l) == C18128l.f35421l) {
                this.f28039l = c18128l4;
            } else {
                C7699l c7699lAds2 = C18128l.ads(c18128l);
                c7699lAds2.isPro(c18128l4);
                this.f28039l = c7699lAds2.admob();
            }
            this.f28035l |= 64;
        }
        if ((c14036l.f27358l & 64) == 64) {
            int i6 = c14036l.f27375l;
            this.f28035l |= 128;
            this.f28036l = i6;
        }
        if (!c14036l.f27372l.isEmpty()) {
            if (this.f28024l.isEmpty()) {
                this.f28024l = c14036l.f27372l;
                this.f28035l &= -257;
            } else {
                if ((this.f28035l & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 256) {
                    this.f28024l = new ArrayList(this.f28024l);
                    this.f28035l |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                }
                this.f28024l.addAll(c14036l.f27372l);
            }
        }
        if (!c14036l.f27357l.isEmpty()) {
            if (this.f28040l.isEmpty()) {
                this.f28040l = c14036l.f27357l;
                this.f28035l &= -513;
            } else {
                if ((this.f28035l & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 512) {
                    this.f28040l = new ArrayList(this.f28040l);
                    this.f28035l |= AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
                }
                this.f28040l.addAll(c14036l.f27357l);
            }
        }
        if (!c14036l.f27369l.isEmpty()) {
            if (this.f28033l.isEmpty()) {
                this.f28033l = c14036l.f27369l;
                this.f28035l &= -1025;
            } else {
                if ((this.f28035l & 1024) != 1024) {
                    this.f28033l = new ArrayList(this.f28033l);
                    this.f28035l |= 1024;
                }
                this.f28033l.addAll(c14036l.f27369l);
            }
        }
        if (!c14036l.f27363l.isEmpty()) {
            if (this.f28029l.isEmpty()) {
                this.f28029l = c14036l.f27363l;
                this.f28035l &= -2049;
            } else {
                if ((this.f28035l & 2048) != 2048) {
                    this.f28029l = new ArrayList(this.f28029l);
                    this.f28035l |= 2048;
                }
                this.f28029l.addAll(c14036l.f27363l);
            }
        }
        if ((c14036l.f27358l & 128) == 128) {
            C3647l c3647l2 = c14036l.f27367l;
            if ((this.f28035l & 4096) != 4096 || (c3647l = this.f28031l) == C3647l.f7625l) {
                this.f28031l = c3647l2;
            } else {
                C10657l c10657lSubs = C3647l.subs(c3647l);
                c10657lSubs.firebase(c3647l2);
                this.f28031l = c10657lSubs.admob();
            }
            this.f28035l |= 4096;
        }
        if (!c14036l.f27377l.isEmpty()) {
            if (this.f28041l.isEmpty()) {
                this.f28041l = c14036l.f27377l;
                this.f28035l &= -8193;
            } else {
                if ((this.f28035l & 8192) != 8192) {
                    this.f28041l = new ArrayList(this.f28041l);
                    this.f28035l |= 8192;
                }
                this.f28041l.addAll(c14036l.f27377l);
            }
        }
        if ((c14036l.f27358l & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            C15743l c15743l2 = c14036l.f27366l;
            if ((this.f28035l & 16384) != 16384 || (c15743l = this.f28030l) == C15743l.f30919l) {
                this.f28030l = c15743l2;
            } else {
                C3730l c3730l = new C3730l(0);
                c3730l.f7796l = Collections.EMPTY_LIST;
                c3730l.firebase(c15743l);
                c3730l.firebase(c15743l2);
                this.f28030l = c3730l.billing();
            }
            this.f28035l |= 16384;
        }
        if (!c14036l.f27361l.isEmpty()) {
            if (this.f28027l.isEmpty()) {
                this.f28027l = c14036l.f27361l;
                this.f28035l &= -32769;
            } else {
                if ((this.f28035l & 32768) != 32768) {
                    this.f28027l = new ArrayList(this.f28027l);
                    this.f28035l |= 32768;
                }
                this.f28027l.addAll(c14036l.f27361l);
            }
        }
        if (!c14036l.f27360l.isEmpty()) {
            if (this.f28026l.isEmpty()) {
                this.f28026l = c14036l.f27360l;
                this.f28035l &= -65537;
            } else {
                if ((this.f28035l & 65536) != 65536) {
                    this.f28026l = new ArrayList(this.f28026l);
                    this.f28035l |= 65536;
                }
                this.f28026l.addAll(c14036l.f27360l);
            }
        }
        if (!c14036l.f27356l.isEmpty()) {
            if (this.f28023l.isEmpty()) {
                this.f28023l = c14036l.f27356l;
                this.f28035l &= -131073;
            } else {
                if ((this.f28035l & 131072) != 131072) {
                    this.f28023l = new ArrayList(this.f28023l);
                    this.f28035l |= 131072;
                }
                this.f28023l.addAll(c14036l.f27356l);
            }
        }
        billing(c14036l);
        this.f5168l = this.f5168l.billing(c14036l.f27365l);
    }

    @Override // defpackage.AbstractC2398l
    public final /* bridge */ /* synthetic */ AbstractC2398l purchase(AbstractC4730l abstractC4730l) {
        isPro((C14036l) abstractC4730l);
        return this;
    }
}
