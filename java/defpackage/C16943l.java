package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؙٗؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16943l extends AbstractC2439l {

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public List f33028l;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public int f33029l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public List f33030l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f33031l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public C18128l f33032l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public int f33033l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public List f33034l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public List f33035l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public C3647l f33036l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public List f33037l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public List f33038l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public List f33039l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public List f33040l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public List f33041l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f33042l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f33043l;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public C1339l f33044l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public List f33045l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public List f33046l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f33047l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public List f33048l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public List f33049l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public List f33050l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public List f33051l;

    public static C16943l subs() {
        C16943l c16943l = new C16943l();
        c16943l.f33042l = 6;
        List list = Collections.EMPTY_LIST;
        c16943l.f33034l = list;
        c16943l.f33046l = list;
        c16943l.f33040l = list;
        c16943l.f33048l = list;
        c16943l.f33045l = list;
        c16943l.f33030l = list;
        c16943l.f33049l = list;
        c16943l.f33041l = list;
        c16943l.f33035l = list;
        c16943l.f33038l = list;
        c16943l.f33050l = list;
        c16943l.f33037l = list;
        c16943l.f33032l = C18128l.f35421l;
        c16943l.f33051l = list;
        c16943l.f33036l = C3647l.f7625l;
        c16943l.f33039l = list;
        c16943l.f33044l = C1339l.f3429l;
        c16943l.f33028l = list;
        return c16943l;
    }

    public final C6582l admob() {
        C6582l c6582l = new C6582l(this);
        int i = this.f33043l;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c6582l.f13789l = this.f33042l;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c6582l.f13788l = this.f33047l;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        c6582l.f13795l = this.f33031l;
        if ((i & 8) == 8) {
            this.f33034l = DesugarCollections.unmodifiableList(this.f33034l);
            this.f33043l &= -9;
        }
        c6582l.f13774l = this.f33034l;
        if ((this.f33043l & 16) == 16) {
            this.f33046l = DesugarCollections.unmodifiableList(this.f33046l);
            this.f33043l &= -17;
        }
        c6582l.f13777l = this.f33046l;
        if ((this.f33043l & 32) == 32) {
            this.f33040l = DesugarCollections.unmodifiableList(this.f33040l);
            this.f33043l &= -33;
        }
        c6582l.f13794l = this.f33040l;
        if ((this.f33043l & 64) == 64) {
            this.f33048l = DesugarCollections.unmodifiableList(this.f33048l);
            this.f33043l &= -65;
        }
        c6582l.f13796l = this.f33048l;
        if ((this.f33043l & 128) == 128) {
            this.f33045l = DesugarCollections.unmodifiableList(this.f33045l);
            this.f33043l &= -129;
        }
        c6582l.f13772l = this.f33045l;
        if ((this.f33043l & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            this.f33030l = DesugarCollections.unmodifiableList(this.f33030l);
            this.f33043l &= -257;
        }
        c6582l.f13797l = this.f33030l;
        if ((this.f33043l & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) == 512) {
            this.f33049l = DesugarCollections.unmodifiableList(this.f33049l);
            this.f33043l &= -513;
        }
        c6582l.f13778l = this.f33049l;
        if ((this.f33043l & 1024) == 1024) {
            this.f33041l = DesugarCollections.unmodifiableList(this.f33041l);
            this.f33043l &= -1025;
        }
        c6582l.f13782l = this.f33041l;
        if ((this.f33043l & 2048) == 2048) {
            this.f33035l = DesugarCollections.unmodifiableList(this.f33035l);
            this.f33043l &= -2049;
        }
        c6582l.f13799l = this.f33035l;
        if ((this.f33043l & 4096) == 4096) {
            this.f33038l = DesugarCollections.unmodifiableList(this.f33038l);
            this.f33043l &= -4097;
        }
        c6582l.f13781l = this.f33038l;
        if ((this.f33043l & 8192) == 8192) {
            this.f33050l = DesugarCollections.unmodifiableList(this.f33050l);
            this.f33043l &= -8193;
        }
        c6582l.f13776l = this.f33050l;
        if ((this.f33043l & 16384) == 16384) {
            this.f33037l = DesugarCollections.unmodifiableList(this.f33037l);
            this.f33043l &= -16385;
        }
        c6582l.f13775l = this.f33037l;
        if ((i & 32768) == 32768) {
            i2 |= 8;
        }
        c6582l.f13800l = this.f33033l;
        if ((i & 65536) == 65536) {
            i2 |= 16;
        }
        c6582l.f13779l = this.f33032l;
        if ((i & 131072) == 131072) {
            i2 |= 32;
        }
        c6582l.f13785l = this.f33029l;
        if ((this.f33043l & 262144) == 262144) {
            this.f33051l = DesugarCollections.unmodifiableList(this.f33051l);
            this.f33043l &= -262145;
        }
        c6582l.f13791l = this.f33051l;
        if ((i & 524288) == 524288) {
            i2 |= 64;
        }
        c6582l.f13770l = this.f33036l;
        if ((this.f33043l & 1048576) == 1048576) {
            this.f33039l = DesugarCollections.unmodifiableList(this.f33039l);
            this.f33043l &= -1048577;
        }
        c6582l.f13784l = this.f33039l;
        if ((i & 2097152) == 2097152) {
            i2 |= 128;
        }
        c6582l.f13790l = this.f33044l;
        if ((this.f33043l & 4194304) == 4194304) {
            this.f33028l = DesugarCollections.unmodifiableList(this.f33028l);
            this.f33043l &= -4194305;
        }
        c6582l.f13798l = this.f33028l;
        c6582l.f13773l = i2;
        return c6582l;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // defpackage.AbstractC2398l
    public final AbstractC2398l amazon(C1718l c1718l, C3429l c3429l) throws Throwable {
        C6582l c6582l = null;
        try {
            try {
                C6582l.f13769l.getClass();
                isPro(new C6582l(c1718l, c3429l));
                return this;
            } catch (Throwable th) {
                th = th;
                if (c6582l != null) {
                    isPro(c6582l);
                }
                throw th;
            }
        } catch (C12383l e) {
            C6582l c6582l2 = (C6582l) e.f24472l;
            try {
                throw e;
            } catch (Throwable th2) {
                th = th2;
                c6582l = c6582l2;
                if (c6582l != null) {
                    isPro(c6582l);
                }
                throw th;
            }
        }
    }

    public final Object clone() {
        C16943l c16943lSubs = subs();
        c16943lSubs.isPro(admob());
        return c16943lSubs;
    }

    @Override // defpackage.AbstractC2398l
    public final AbstractC14080l crashlytics() {
        C6582l c6582lAdmob = admob();
        if (c6582lAdmob.yandex()) {
            return c6582lAdmob;
        }
        throw new C6451l();
    }

    public final void isPro(C6582l c6582l) {
        C1339l c1339l;
        C3647l c3647l;
        C18128l c18128l;
        if (c6582l == C6582l.f13768l) {
            return;
        }
        int i = c6582l.f13773l;
        if ((i & 1) == 1) {
            int i2 = c6582l.f13789l;
            this.f33043l = 1 | this.f33043l;
            this.f33042l = i2;
        }
        int i3 = 2;
        if ((i & 2) == 2) {
            int i4 = c6582l.f13788l;
            this.f33043l |= 2;
            this.f33047l = i4;
        }
        if ((i & 4) == 4) {
            int i5 = c6582l.f13795l;
            this.f33043l = 4 | this.f33043l;
            this.f33031l = i5;
        }
        if (!c6582l.f13774l.isEmpty()) {
            if (this.f33034l.isEmpty()) {
                this.f33034l = c6582l.f13774l;
                this.f33043l &= -9;
            } else {
                if ((this.f33043l & 8) != 8) {
                    this.f33034l = new ArrayList(this.f33034l);
                    this.f33043l |= 8;
                }
                this.f33034l.addAll(c6582l.f13774l);
            }
        }
        if (!c6582l.f13777l.isEmpty()) {
            if (this.f33046l.isEmpty()) {
                this.f33046l = c6582l.f13777l;
                this.f33043l &= -17;
            } else {
                if ((this.f33043l & 16) != 16) {
                    this.f33046l = new ArrayList(this.f33046l);
                    this.f33043l |= 16;
                }
                this.f33046l.addAll(c6582l.f13777l);
            }
        }
        if (!c6582l.f13794l.isEmpty()) {
            if (this.f33040l.isEmpty()) {
                this.f33040l = c6582l.f13794l;
                this.f33043l &= -33;
            } else {
                if ((this.f33043l & 32) != 32) {
                    this.f33040l = new ArrayList(this.f33040l);
                    this.f33043l |= 32;
                }
                this.f33040l.addAll(c6582l.f13794l);
            }
        }
        if (!c6582l.f13796l.isEmpty()) {
            if (this.f33048l.isEmpty()) {
                this.f33048l = c6582l.f13796l;
                this.f33043l &= -65;
            } else {
                if ((this.f33043l & 64) != 64) {
                    this.f33048l = new ArrayList(this.f33048l);
                    this.f33043l |= 64;
                }
                this.f33048l.addAll(c6582l.f13796l);
            }
        }
        if (!c6582l.f13772l.isEmpty()) {
            if (this.f33045l.isEmpty()) {
                this.f33045l = c6582l.f13772l;
                this.f33043l &= -129;
            } else {
                if ((this.f33043l & 128) != 128) {
                    this.f33045l = new ArrayList(this.f33045l);
                    this.f33043l |= 128;
                }
                this.f33045l.addAll(c6582l.f13772l);
            }
        }
        if (!c6582l.f13797l.isEmpty()) {
            if (this.f33030l.isEmpty()) {
                this.f33030l = c6582l.f13797l;
                this.f33043l &= -257;
            } else {
                if ((this.f33043l & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 256) {
                    this.f33030l = new ArrayList(this.f33030l);
                    this.f33043l |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                }
                this.f33030l.addAll(c6582l.f13797l);
            }
        }
        if (!c6582l.f13778l.isEmpty()) {
            if (this.f33049l.isEmpty()) {
                this.f33049l = c6582l.f13778l;
                this.f33043l &= -513;
            } else {
                if ((this.f33043l & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 512) {
                    this.f33049l = new ArrayList(this.f33049l);
                    this.f33043l |= AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
                }
                this.f33049l.addAll(c6582l.f13778l);
            }
        }
        if (!c6582l.f13782l.isEmpty()) {
            if (this.f33041l.isEmpty()) {
                this.f33041l = c6582l.f13782l;
                this.f33043l &= -1025;
            } else {
                if ((this.f33043l & 1024) != 1024) {
                    this.f33041l = new ArrayList(this.f33041l);
                    this.f33043l |= 1024;
                }
                this.f33041l.addAll(c6582l.f13782l);
            }
        }
        if (!c6582l.f13799l.isEmpty()) {
            if (this.f33035l.isEmpty()) {
                this.f33035l = c6582l.f13799l;
                this.f33043l &= -2049;
            } else {
                if ((this.f33043l & 2048) != 2048) {
                    this.f33035l = new ArrayList(this.f33035l);
                    this.f33043l |= 2048;
                }
                this.f33035l.addAll(c6582l.f13799l);
            }
        }
        if (!c6582l.f13781l.isEmpty()) {
            if (this.f33038l.isEmpty()) {
                this.f33038l = c6582l.f13781l;
                this.f33043l &= -4097;
            } else {
                if ((this.f33043l & 4096) != 4096) {
                    this.f33038l = new ArrayList(this.f33038l);
                    this.f33043l |= 4096;
                }
                this.f33038l.addAll(c6582l.f13781l);
            }
        }
        if (!c6582l.f13776l.isEmpty()) {
            if (this.f33050l.isEmpty()) {
                this.f33050l = c6582l.f13776l;
                this.f33043l &= -8193;
            } else {
                if ((this.f33043l & 8192) != 8192) {
                    this.f33050l = new ArrayList(this.f33050l);
                    this.f33043l |= 8192;
                }
                this.f33050l.addAll(c6582l.f13776l);
            }
        }
        if (!c6582l.f13775l.isEmpty()) {
            if (this.f33037l.isEmpty()) {
                this.f33037l = c6582l.f13775l;
                this.f33043l &= -16385;
            } else {
                if ((this.f33043l & 16384) != 16384) {
                    this.f33037l = new ArrayList(this.f33037l);
                    this.f33043l |= 16384;
                }
                this.f33037l.addAll(c6582l.f13775l);
            }
        }
        int i6 = c6582l.f13773l;
        if ((i6 & 8) == 8) {
            int i7 = c6582l.f13800l;
            this.f33043l |= 32768;
            this.f33033l = i7;
        }
        if ((i6 & 16) == 16) {
            C18128l c18128l2 = c6582l.f13779l;
            if ((this.f33043l & 65536) != 65536 || (c18128l = this.f33032l) == C18128l.f35421l) {
                this.f33032l = c18128l2;
            } else {
                C7699l c7699lAds = C18128l.ads(c18128l);
                c7699lAds.isPro(c18128l2);
                this.f33032l = c7699lAds.admob();
            }
            this.f33043l |= 65536;
        }
        if ((c6582l.f13773l & 32) == 32) {
            int i8 = c6582l.f13785l;
            this.f33043l |= 131072;
            this.f33029l = i8;
        }
        if (!c6582l.f13791l.isEmpty()) {
            if (this.f33051l.isEmpty()) {
                this.f33051l = c6582l.f13791l;
                this.f33043l &= -262145;
            } else {
                if ((this.f33043l & 262144) != 262144) {
                    this.f33051l = new ArrayList(this.f33051l);
                    this.f33043l |= 262144;
                }
                this.f33051l.addAll(c6582l.f13791l);
            }
        }
        if ((c6582l.f13773l & 64) == 64) {
            C3647l c3647l2 = c6582l.f13770l;
            if ((this.f33043l & 524288) != 524288 || (c3647l = this.f33036l) == C3647l.f7625l) {
                this.f33036l = c3647l2;
            } else {
                C10657l c10657lSubs = C3647l.subs(c3647l);
                c10657lSubs.firebase(c3647l2);
                this.f33036l = c10657lSubs.admob();
            }
            this.f33043l |= 524288;
        }
        if (!c6582l.f13784l.isEmpty()) {
            if (this.f33039l.isEmpty()) {
                this.f33039l = c6582l.f13784l;
                this.f33043l &= -1048577;
            } else {
                if ((this.f33043l & 1048576) != 1048576) {
                    this.f33039l = new ArrayList(this.f33039l);
                    this.f33043l |= 1048576;
                }
                this.f33039l.addAll(c6582l.f13784l);
            }
        }
        if ((c6582l.f13773l & 128) == 128) {
            C1339l c1339l2 = c6582l.f13790l;
            if ((this.f33043l & 2097152) != 2097152 || (c1339l = this.f33044l) == C1339l.f3429l) {
                this.f33044l = c1339l2;
            } else {
                C3730l c3730l = new C3730l(i3);
                c3730l.f7796l = Collections.EMPTY_LIST;
                c3730l.vip(c1339l);
                c3730l.vip(c1339l2);
                this.f33044l = c3730l.isPro();
            }
            this.f33043l |= 2097152;
        }
        if (!c6582l.f13798l.isEmpty()) {
            if (this.f33028l.isEmpty()) {
                this.f33028l = c6582l.f13798l;
                this.f33043l &= -4194305;
            } else {
                if ((this.f33043l & 4194304) != 4194304) {
                    this.f33028l = new ArrayList(this.f33028l);
                    this.f33043l |= 4194304;
                }
                this.f33028l.addAll(c6582l.f13798l);
            }
        }
        billing(c6582l);
        this.f5168l = this.f5168l.billing(c6582l.f13780l);
    }

    @Override // defpackage.AbstractC2398l
    public final /* bridge */ /* synthetic */ AbstractC2398l purchase(AbstractC4730l abstractC4730l) {
        isPro((C6582l) abstractC4730l);
        return this;
    }
}
