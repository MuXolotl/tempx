package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lْۨۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13836l extends AbstractC2398l implements InterfaceC8988l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public int f26978l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public EnumC16484l f26979l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f26980l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f26981l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f26982l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public C7899l f26983l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public float f26984l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public long f26985l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public int f26986l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f26987l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public double f26988l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public List f26989l;

    public static C13836l admob() {
        C13836l c13836l = new C13836l();
        c13836l.f26979l = EnumC16484l.BYTE;
        c13836l.f26983l = C7899l.f16470l;
        c13836l.f26989l = Collections.EMPTY_LIST;
        return c13836l;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // defpackage.AbstractC2398l
    public final AbstractC2398l amazon(C1718l c1718l, C3429l c3429l) throws Throwable {
        C4207l c4207l = null;
        try {
            try {
                C4207l.f8623l.getClass();
                subs(new C4207l(c1718l, c3429l));
                return this;
            } catch (Throwable th) {
                th = th;
                if (c4207l != null) {
                    subs(c4207l);
                }
                throw th;
            }
        } catch (C12383l e) {
            C4207l c4207l2 = (C4207l) e.f24472l;
            try {
                throw e;
            } catch (Throwable th2) {
                th = th2;
                c4207l = c4207l2;
                if (c4207l != null) {
                    subs(c4207l);
                }
                throw th;
            }
        }
    }

    public final C4207l billing() {
        C4207l c4207l = new C4207l(this);
        int i = this.f26982l;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c4207l.f8625l = this.f26979l;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c4207l.f8633l = this.f26985l;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        c4207l.f8632l = this.f26984l;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        c4207l.f8636l = this.f26988l;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        c4207l.f8626l = this.f26980l;
        if ((i & 32) == 32) {
            i2 |= 32;
        }
        c4207l.f8627l = this.f26981l;
        if ((i & 64) == 64) {
            i2 |= 64;
        }
        c4207l.f8635l = this.f26987l;
        if ((i & 128) == 128) {
            i2 |= 128;
        }
        c4207l.f8630l = this.f26983l;
        if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            this.f26989l = DesugarCollections.unmodifiableList(this.f26989l);
            this.f26982l &= -257;
        }
        c4207l.f8637l = this.f26989l;
        if ((i & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) == 512) {
            i2 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        c4207l.f8634l = this.f26986l;
        if ((i & 1024) == 1024) {
            i2 |= AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
        }
        c4207l.f8624l = this.f26978l;
        c4207l.f8628l = i2;
        return c4207l;
    }

    public final Object clone() {
        C13836l c13836lAdmob = admob();
        c13836lAdmob.subs(billing());
        return c13836lAdmob;
    }

    @Override // defpackage.AbstractC2398l
    public final AbstractC14080l crashlytics() {
        C4207l c4207lBilling = billing();
        if (c4207lBilling.yandex()) {
            return c4207lBilling;
        }
        throw new C6451l();
    }

    @Override // defpackage.AbstractC2398l
    public final /* bridge */ /* synthetic */ AbstractC2398l purchase(AbstractC4730l abstractC4730l) {
        subs((C4207l) abstractC4730l);
        return this;
    }

    public final void subs(C4207l c4207l) {
        C7899l c7899l;
        if (c4207l == C4207l.f8622l) {
            return;
        }
        if ((c4207l.f8628l & 1) == 1) {
            EnumC16484l enumC16484l = c4207l.f8625l;
            enumC16484l.getClass();
            this.f26982l = 1 | this.f26982l;
            this.f26979l = enumC16484l;
        }
        int i = c4207l.f8628l;
        if ((i & 2) == 2) {
            long j = c4207l.f8633l;
            this.f26982l |= 2;
            this.f26985l = j;
        }
        if ((i & 4) == 4) {
            float f = c4207l.f8632l;
            this.f26982l = 4 | this.f26982l;
            this.f26984l = f;
        }
        if ((i & 8) == 8) {
            double d = c4207l.f8636l;
            this.f26982l |= 8;
            this.f26988l = d;
        }
        if ((i & 16) == 16) {
            int i2 = c4207l.f8626l;
            this.f26982l = 16 | this.f26982l;
            this.f26980l = i2;
        }
        if ((i & 32) == 32) {
            int i3 = c4207l.f8627l;
            this.f26982l = 32 | this.f26982l;
            this.f26981l = i3;
        }
        if ((i & 64) == 64) {
            int i4 = c4207l.f8635l;
            this.f26982l = 64 | this.f26982l;
            this.f26987l = i4;
        }
        if ((i & 128) == 128) {
            C7899l c7899l2 = c4207l.f8630l;
            if ((this.f26982l & 128) != 128 || (c7899l = this.f26983l) == C7899l.f16470l) {
                this.f26983l = c7899l2;
            } else {
                C10657l c10657l = new C10657l(0);
                c10657l.f21625l = Collections.EMPTY_LIST;
                c10657l.isPro(c7899l);
                c10657l.isPro(c7899l2);
                this.f26983l = c10657l.billing();
            }
            this.f26982l |= 128;
        }
        if (!c4207l.f8637l.isEmpty()) {
            if (this.f26989l.isEmpty()) {
                this.f26989l = c4207l.f8637l;
                this.f26982l &= -257;
            } else {
                if ((this.f26982l & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 256) {
                    this.f26989l = new ArrayList(this.f26989l);
                    this.f26982l |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                }
                this.f26989l.addAll(c4207l.f8637l);
            }
        }
        int i5 = c4207l.f8628l;
        if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            int i6 = c4207l.f8634l;
            this.f26982l |= AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
            this.f26986l = i6;
        }
        if ((i5 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) == 512) {
            int i7 = c4207l.f8624l;
            this.f26982l |= 1024;
            this.f26978l = i7;
        }
        this.f5168l = this.f5168l.billing(c4207l.f8629l);
    }
}
