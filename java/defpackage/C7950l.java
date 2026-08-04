package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lًّؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7950l extends AbstractC2439l {

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public C15743l f16547l;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public List f16548l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public List f16549l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f16550l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public List f16551l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public List f16552l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public C18128l f16553l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public C18426l f16554l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public List f16555l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public List f16556l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public int f16557l;

    /* JADX INFO: renamed from: lؚؕؖ, reason: contains not printable characters */
    public C15743l f16558l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public List f16559l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public List f16560l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public List f16561l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f16562l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f16563l;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public List f16564l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public int f16565l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f16566l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f16567l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public C18128l f16568l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public List f16569l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public int f16570l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public List f16571l;

    public static C7950l subs() {
        C7950l c7950l = new C7950l();
        c7950l.f16562l = 518;
        c7950l.f16567l = 2054;
        C18128l c18128l = C18128l.f35421l;
        c7950l.f16553l = c18128l;
        List list = Collections.EMPTY_LIST;
        c7950l.f16560l = list;
        c7950l.f16568l = c18128l;
        c7950l.f16549l = list;
        c7950l.f16569l = list;
        c7950l.f16561l = list;
        c7950l.f16554l = C18426l.f35982l;
        c7950l.f16556l = list;
        c7950l.f16552l = list;
        c7950l.f16551l = list;
        c7950l.f16548l = list;
        c7950l.f16571l = list;
        c7950l.f16555l = list;
        c7950l.f16559l = list;
        c7950l.f16564l = list;
        C15743l c15743l = C15743l.f30919l;
        c7950l.f16547l = c15743l;
        c7950l.f16558l = c15743l;
        return c7950l;
    }

    public final C13146l admob() {
        C13146l c13146l = new C13146l(this);
        int i = this.f16563l;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c13146l.f25731l = this.f16562l;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c13146l.f25730l = this.f16567l;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        c13146l.f25736l = this.f16550l;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        c13146l.f25717l = this.f16553l;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        c13146l.f25720l = this.f16566l;
        if ((i & 32) == 32) {
            this.f16560l = DesugarCollections.unmodifiableList(this.f16560l);
            this.f16563l &= -33;
        }
        c13146l.f25735l = this.f16560l;
        if ((i & 64) == 64) {
            i2 |= 32;
        }
        c13146l.f25728l = this.f16568l;
        if ((i & 128) == 128) {
            i2 |= 64;
        }
        c13146l.f25737l = this.f16565l;
        if ((this.f16563l & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            this.f16549l = DesugarCollections.unmodifiableList(this.f16549l);
            this.f16563l &= -257;
        }
        c13146l.f25734l = this.f16549l;
        if ((this.f16563l & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) == 512) {
            this.f16569l = DesugarCollections.unmodifiableList(this.f16569l);
            this.f16563l &= -513;
        }
        c13146l.f25715l = this.f16569l;
        if ((this.f16563l & 1024) == 1024) {
            this.f16561l = DesugarCollections.unmodifiableList(this.f16561l);
            this.f16563l &= -1025;
        }
        c13146l.f25729l = this.f16561l;
        if ((i & 2048) == 2048) {
            i2 |= 128;
        }
        c13146l.f25721l = this.f16554l;
        if ((i & 4096) == 4096) {
            i2 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        c13146l.f25725l = this.f16557l;
        if ((i & 8192) == 8192) {
            i2 |= AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
        }
        c13146l.f25740l = this.f16570l;
        if ((this.f16563l & 16384) == 16384) {
            this.f16556l = DesugarCollections.unmodifiableList(this.f16556l);
            this.f16563l &= -16385;
        }
        c13146l.f25724l = this.f16556l;
        if ((this.f16563l & 32768) == 32768) {
            this.f16552l = DesugarCollections.unmodifiableList(this.f16552l);
            this.f16563l &= -32769;
        }
        c13146l.f25719l = this.f16552l;
        if ((this.f16563l & 65536) == 65536) {
            this.f16551l = DesugarCollections.unmodifiableList(this.f16551l);
            this.f16563l &= -65537;
        }
        c13146l.f25718l = this.f16551l;
        if ((this.f16563l & 131072) == 131072) {
            this.f16548l = DesugarCollections.unmodifiableList(this.f16548l);
            this.f16563l &= -131073;
        }
        c13146l.f25714l = this.f16548l;
        if ((this.f16563l & 262144) == 262144) {
            this.f16571l = DesugarCollections.unmodifiableList(this.f16571l);
            this.f16563l &= -262145;
        }
        c13146l.f25741l = this.f16571l;
        if ((this.f16563l & 524288) == 524288) {
            this.f16555l = DesugarCollections.unmodifiableList(this.f16555l);
            this.f16563l &= -524289;
        }
        c13146l.f25722l = this.f16555l;
        if ((this.f16563l & 1048576) == 1048576) {
            this.f16559l = DesugarCollections.unmodifiableList(this.f16559l);
            this.f16563l &= -1048577;
        }
        c13146l.f25727l = this.f16559l;
        if ((this.f16563l & 2097152) == 2097152) {
            this.f16564l = DesugarCollections.unmodifiableList(this.f16564l);
            this.f16563l &= -2097153;
        }
        c13146l.f25733l = this.f16564l;
        if ((i & 4194304) == 4194304) {
            i2 |= 1024;
        }
        c13146l.f25713l = this.f16547l;
        if ((i & 8388608) == 8388608) {
            i2 |= 2048;
        }
        c13146l.f25726l = this.f16558l;
        c13146l.f25716l = i2;
        return c13146l;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // defpackage.AbstractC2398l
    public final AbstractC2398l amazon(C1718l c1718l, C3429l c3429l) throws Throwable {
        C13146l c13146l = null;
        try {
            try {
                C13146l.f25712l.getClass();
                isPro(new C13146l(c1718l, c3429l));
                return this;
            } catch (Throwable th) {
                th = th;
                if (c13146l != null) {
                    isPro(c13146l);
                }
                throw th;
            }
        } catch (C12383l e) {
            C13146l c13146l2 = (C13146l) e.f24472l;
            try {
                throw e;
            } catch (Throwable th2) {
                th = th2;
                c13146l = c13146l2;
                if (c13146l != null) {
                    isPro(c13146l);
                }
                throw th;
            }
        }
    }

    public final Object clone() {
        C7950l c7950lSubs = subs();
        c7950lSubs.isPro(admob());
        return c7950lSubs;
    }

    @Override // defpackage.AbstractC2398l
    public final AbstractC14080l crashlytics() {
        C13146l c13146lAdmob = admob();
        if (c13146lAdmob.yandex()) {
            return c13146lAdmob;
        }
        throw new C6451l();
    }

    public final void isPro(C13146l c13146l) {
        C15743l c15743l;
        C15743l c15743l2;
        C18426l c18426l;
        C18128l c18128l;
        C18128l c18128l2;
        if (c13146l == C13146l.f25711l) {
            return;
        }
        int i = c13146l.f25716l;
        if ((i & 1) == 1) {
            int i2 = c13146l.f25731l;
            this.f16563l = 1 | this.f16563l;
            this.f16562l = i2;
        }
        if ((i & 2) == 2) {
            int i3 = c13146l.f25730l;
            this.f16563l = 2 | this.f16563l;
            this.f16567l = i3;
        }
        if ((i & 4) == 4) {
            int i4 = c13146l.f25736l;
            this.f16563l = 4 | this.f16563l;
            this.f16550l = i4;
        }
        if ((i & 8) == 8) {
            C18128l c18128l3 = c13146l.f25717l;
            if ((this.f16563l & 8) != 8 || (c18128l2 = this.f16553l) == C18128l.f35421l) {
                this.f16553l = c18128l3;
            } else {
                C7699l c7699lAds = C18128l.ads(c18128l2);
                c7699lAds.isPro(c18128l3);
                this.f16553l = c7699lAds.admob();
            }
            this.f16563l |= 8;
        }
        if ((c13146l.f25716l & 16) == 16) {
            int i5 = c13146l.f25720l;
            this.f16563l = 16 | this.f16563l;
            this.f16566l = i5;
        }
        if (!c13146l.f25735l.isEmpty()) {
            if (this.f16560l.isEmpty()) {
                this.f16560l = c13146l.f25735l;
                this.f16563l &= -33;
            } else {
                if ((this.f16563l & 32) != 32) {
                    this.f16560l = new ArrayList(this.f16560l);
                    this.f16563l |= 32;
                }
                this.f16560l.addAll(c13146l.f25735l);
            }
        }
        if ((c13146l.f25716l & 32) == 32) {
            C18128l c18128l4 = c13146l.f25728l;
            if ((this.f16563l & 64) != 64 || (c18128l = this.f16568l) == C18128l.f35421l) {
                this.f16568l = c18128l4;
            } else {
                C7699l c7699lAds2 = C18128l.ads(c18128l);
                c7699lAds2.isPro(c18128l4);
                this.f16568l = c7699lAds2.admob();
            }
            this.f16563l |= 64;
        }
        if ((c13146l.f25716l & 64) == 64) {
            int i6 = c13146l.f25737l;
            this.f16563l |= 128;
            this.f16565l = i6;
        }
        if (!c13146l.f25734l.isEmpty()) {
            if (this.f16549l.isEmpty()) {
                this.f16549l = c13146l.f25734l;
                this.f16563l &= -257;
            } else {
                if ((this.f16563l & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 256) {
                    this.f16549l = new ArrayList(this.f16549l);
                    this.f16563l |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                }
                this.f16549l.addAll(c13146l.f25734l);
            }
        }
        if (!c13146l.f25715l.isEmpty()) {
            if (this.f16569l.isEmpty()) {
                this.f16569l = c13146l.f25715l;
                this.f16563l &= -513;
            } else {
                if ((this.f16563l & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 512) {
                    this.f16569l = new ArrayList(this.f16569l);
                    this.f16563l |= AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
                }
                this.f16569l.addAll(c13146l.f25715l);
            }
        }
        if (!c13146l.f25729l.isEmpty()) {
            if (this.f16561l.isEmpty()) {
                this.f16561l = c13146l.f25729l;
                this.f16563l &= -1025;
            } else {
                if ((this.f16563l & 1024) != 1024) {
                    this.f16561l = new ArrayList(this.f16561l);
                    this.f16563l |= 1024;
                }
                this.f16561l.addAll(c13146l.f25729l);
            }
        }
        if ((c13146l.f25716l & 128) == 128) {
            C18426l c18426l2 = c13146l.f25721l;
            if ((this.f16563l & 2048) != 2048 || (c18426l = this.f16554l) == C18426l.f35982l) {
                this.f16554l = c18426l2;
            } else {
                C9259l c9259lSubs = C9259l.subs();
                c9259lSubs.isPro(c18426l);
                c9259lSubs.isPro(c18426l2);
                this.f16554l = c9259lSubs.admob();
            }
            this.f16563l |= 2048;
        }
        int i7 = c13146l.f25716l;
        if ((i7 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            int i8 = c13146l.f25725l;
            this.f16563l |= 4096;
            this.f16557l = i8;
        }
        if ((i7 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) == 512) {
            int i9 = c13146l.f25740l;
            this.f16563l |= 8192;
            this.f16570l = i9;
        }
        if (!c13146l.f25724l.isEmpty()) {
            if (this.f16556l.isEmpty()) {
                this.f16556l = c13146l.f25724l;
                this.f16563l &= -16385;
            } else {
                if ((this.f16563l & 16384) != 16384) {
                    this.f16556l = new ArrayList(this.f16556l);
                    this.f16563l |= 16384;
                }
                this.f16556l.addAll(c13146l.f25724l);
            }
        }
        if (!c13146l.f25719l.isEmpty()) {
            if (this.f16552l.isEmpty()) {
                this.f16552l = c13146l.f25719l;
                this.f16563l &= -32769;
            } else {
                if ((this.f16563l & 32768) != 32768) {
                    this.f16552l = new ArrayList(this.f16552l);
                    this.f16563l |= 32768;
                }
                this.f16552l.addAll(c13146l.f25719l);
            }
        }
        if (!c13146l.f25718l.isEmpty()) {
            if (this.f16551l.isEmpty()) {
                this.f16551l = c13146l.f25718l;
                this.f16563l &= -65537;
            } else {
                if ((this.f16563l & 65536) != 65536) {
                    this.f16551l = new ArrayList(this.f16551l);
                    this.f16563l |= 65536;
                }
                this.f16551l.addAll(c13146l.f25718l);
            }
        }
        if (!c13146l.f25714l.isEmpty()) {
            if (this.f16548l.isEmpty()) {
                this.f16548l = c13146l.f25714l;
                this.f16563l &= -131073;
            } else {
                if ((this.f16563l & 131072) != 131072) {
                    this.f16548l = new ArrayList(this.f16548l);
                    this.f16563l |= 131072;
                }
                this.f16548l.addAll(c13146l.f25714l);
            }
        }
        if (!c13146l.f25741l.isEmpty()) {
            if (this.f16571l.isEmpty()) {
                this.f16571l = c13146l.f25741l;
                this.f16563l &= -262145;
            } else {
                if ((this.f16563l & 262144) != 262144) {
                    this.f16571l = new ArrayList(this.f16571l);
                    this.f16563l |= 262144;
                }
                this.f16571l.addAll(c13146l.f25741l);
            }
        }
        if (!c13146l.f25722l.isEmpty()) {
            if (this.f16555l.isEmpty()) {
                this.f16555l = c13146l.f25722l;
                this.f16563l &= -524289;
            } else {
                if ((this.f16563l & 524288) != 524288) {
                    this.f16555l = new ArrayList(this.f16555l);
                    this.f16563l |= 524288;
                }
                this.f16555l.addAll(c13146l.f25722l);
            }
        }
        if (!c13146l.f25727l.isEmpty()) {
            if (this.f16559l.isEmpty()) {
                this.f16559l = c13146l.f25727l;
                this.f16563l &= -1048577;
            } else {
                if ((this.f16563l & 1048576) != 1048576) {
                    this.f16559l = new ArrayList(this.f16559l);
                    this.f16563l |= 1048576;
                }
                this.f16559l.addAll(c13146l.f25727l);
            }
        }
        if (!c13146l.f25733l.isEmpty()) {
            if (this.f16564l.isEmpty()) {
                this.f16564l = c13146l.f25733l;
                this.f16563l &= -2097153;
            } else {
                if ((this.f16563l & 2097152) != 2097152) {
                    this.f16564l = new ArrayList(this.f16564l);
                    this.f16563l |= 2097152;
                }
                this.f16564l.addAll(c13146l.f25733l);
            }
        }
        int i10 = 0;
        if ((c13146l.f25716l & 1024) == 1024) {
            C15743l c15743l3 = c13146l.f25713l;
            if ((this.f16563l & 4194304) != 4194304 || (c15743l2 = this.f16547l) == C15743l.f30919l) {
                this.f16547l = c15743l3;
            } else {
                C3730l c3730l = new C3730l(i10);
                c3730l.f7796l = Collections.EMPTY_LIST;
                c3730l.firebase(c15743l2);
                c3730l.firebase(c15743l3);
                this.f16547l = c3730l.billing();
            }
            this.f16563l |= 4194304;
        }
        if ((c13146l.f25716l & 2048) == 2048) {
            C15743l c15743l4 = c13146l.f25726l;
            if ((this.f16563l & 8388608) != 8388608 || (c15743l = this.f16558l) == C15743l.f30919l) {
                this.f16558l = c15743l4;
            } else {
                C3730l c3730l2 = new C3730l(i10);
                c3730l2.f7796l = Collections.EMPTY_LIST;
                c3730l2.firebase(c15743l);
                c3730l2.firebase(c15743l4);
                this.f16558l = c3730l2.billing();
            }
            this.f16563l |= 8388608;
        }
        billing(c13146l);
        this.f5168l = this.f5168l.billing(c13146l.f25723l);
    }

    @Override // defpackage.AbstractC2398l
    public final /* bridge */ /* synthetic */ AbstractC2398l purchase(AbstractC4730l abstractC4730l) {
        isPro((C13146l) abstractC4730l);
        return this;
    }
}
