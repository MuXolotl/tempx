package defpackage;

import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؙؓؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6206l extends AbstractC14569l {

    /* JADX INFO: renamed from: lؒٓؐ, reason: contains not printable characters */
    public boolean f13100l;

    /* JADX INFO: renamed from: lٟؓٔ, reason: contains not printable characters */
    public C15730l f13101l;

    /* JADX INFO: renamed from: lؔؕؖ, reason: contains not printable characters */
    public boolean f13102l;

    /* JADX INFO: renamed from: lؚؕؒ, reason: contains not printable characters */
    public C7504l f13103l;

    /* JADX INFO: renamed from: lؕۗؗ, reason: contains not printable characters */
    public C14153l f13104l;

    /* JADX INFO: renamed from: lؕۦؓ, reason: contains not printable characters */
    public final C18730l f13105l;

    /* JADX INFO: renamed from: lؖ۠ٙ, reason: contains not printable characters */
    public Function0 f13106l;

    /* JADX INFO: renamed from: lؚؗٞ, reason: contains not printable characters */
    public final C18730l f13107l;

    /* JADX INFO: renamed from: lؗ۟ۤ, reason: contains not printable characters */
    public C7504l f13108l;

    /* JADX INFO: renamed from: lؘٟۛ, reason: contains not printable characters */
    public boolean f13109l;

    /* JADX INFO: renamed from: lُؚؓ, reason: contains not printable characters */
    public boolean f13110l;

    /* JADX INFO: renamed from: lؚۦؑ, reason: contains not printable characters */
    public C7504l f13111l;

    /* JADX INFO: renamed from: lِِٞ, reason: contains not printable characters */
    public C7504l f13112l;

    /* JADX INFO: renamed from: lِٟ, reason: contains not printable characters */
    public boolean f13113l;

    /* JADX INFO: renamed from: lًّۥ, reason: contains not printable characters */
    public long f13114l;

    /* JADX INFO: renamed from: lؘْٙ, reason: contains not printable characters */
    public String f13115l;

    /* JADX INFO: renamed from: lٖ٘ۘ, reason: contains not printable characters */
    public long f13116l;

    /* JADX INFO: renamed from: lٌؚ٘, reason: contains not printable characters */
    public boolean f13117l;

    /* JADX INFO: renamed from: l٘ٚؒ, reason: contains not printable characters */
    public boolean f13118l;

    public C6206l(InterfaceC2186l interfaceC2186l, C2403l c2403l, String str, Function0 function0, Function0 function1, boolean z, boolean z2) {
        super(c2403l, interfaceC2186l, z, z2, null, null, function0);
        this.f13115l = str;
        this.f13106l = function1;
        this.f13100l = true;
        C18730l c18730l = AbstractC17774l.yandex;
        this.f13105l = new C18730l();
        this.f13107l = new C18730l();
        this.f13116l = -1L;
        this.f13114l = -1L;
    }

    @Override // defpackage.AbstractC14569l, defpackage.InterfaceC13202l
    public final void appmetrica(C9185l c9185l, EnumC9065l enumC9065l, long j) {
        super.appmetrica(c9185l, enumC9065l, j);
        if (enumC9065l != EnumC9065l.f18653l) {
            if (enumC9065l != EnumC9065l.f18652l || this.f13101l == null || this.f13102l) {
                return;
            }
            List list = c9185l.yandex;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C15730l c15730l = (C15730l) list.get(i);
                if (c15730l.crashlytics() && c15730l != this.f13101l) {
                    m1980l(false);
                    return;
                }
            }
            return;
        }
        if (this.f13101l == null) {
            if (AbstractC18112l.billing(c9185l, true, false)) {
                C15730l c15730l2 = (C15730l) c9185l.yandex.get(0);
                c15730l2.yandex();
                this.f13101l = c15730l2;
                if (this.f28514l) {
                    C7504l c7504l = this.f13112l;
                    if (c7504l != null && c7504l.mopub()) {
                        ((InterfaceC3114l) AbstractC13402l.loadAd(this, AbstractC4751l.tapsense)).getClass();
                        if (c15730l2.loadAd - this.f13116l < 40) {
                            this.f13118l = true;
                            return;
                        }
                        this.f13110l = true;
                        C7504l c7504l2 = this.f13112l;
                        if (c7504l2 != null) {
                            c7504l2.ads(null);
                        }
                        this.f13112l = null;
                    }
                    this.f13102l = false;
                    m3863l(c15730l2);
                    if (this.f13106l != null) {
                        this.f13108l = AbstractC10999l.mopub(m3914l(), null, 0, new C7785l(this, null, 0), 3);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        boolean z = c9185l.crashlytics == 2;
        List list2 = c9185l.yandex;
        if (z && !this.f13102l && this.f28514l && this.f13106l != null) {
            C7504l c7504l3 = this.f13108l;
            if (c7504l3 != null) {
                c7504l3.ads(null);
            }
            this.f13108l = null;
            Function0 function0 = this.f13106l;
            if (function0 != null) {
                function0.invoke();
            }
            if (this.f13100l) {
                ((C9421l) ((InterfaceC1234l) AbstractC13402l.loadAd(this, AbstractC4751l.smaato))).yandex(0);
            }
            this.f13102l = true;
        }
        if (this.f13102l) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (!AbstractC3474l.billing((C15730l) list2.get(i2))) {
                    int size3 = list2.size();
                    for (int i3 = 0; i3 < size3; i3++) {
                        ((C15730l) list2.get(i3)).yandex();
                    }
                    return;
                }
            }
            C15730l c15730l3 = (C15730l) list2.get(0);
            c15730l3.yandex();
            m1984l(c15730l3.loadAd, this.f13101l);
            return;
        }
        int size4 = list2.size();
        for (int i4 = 0; i4 < size4; i4++) {
            if (!AbstractC3474l.purchase((C15730l) list2.get(i4))) {
                long jM3869l = m3869l(j);
                int size5 = list2.size();
                for (int i5 = 0; i5 < size5; i5++) {
                    C15730l c15730l4 = (C15730l) list2.get(i5);
                    if (c15730l4.crashlytics() || AbstractC3474l.admob(c15730l4, j, jM3869l)) {
                        m1980l(false);
                        return;
                    }
                }
                return;
            }
        }
        C15730l c15730l5 = (C15730l) list2.get(0);
        c15730l5.yandex();
        m1984l(c15730l5.loadAd, this.f13101l);
    }

    @Override // defpackage.AbstractC14569l
    /* JADX INFO: renamed from: lؓۚ۟, reason: contains not printable characters */
    public final void mo1978l(KeyEvent keyEvent) {
        long jAmazon = AbstractC16422l.amazon(keyEvent);
        C18730l c18730l = this.f13105l;
        boolean z = false;
        if (c18730l.purchase(jAmazon) != null) {
            InterfaceC7042l interfaceC7042l = (InterfaceC7042l) c18730l.purchase(jAmazon);
            if (interfaceC7042l != null) {
                if (interfaceC7042l.mopub()) {
                    interfaceC7042l.ads(null);
                } else {
                    z = true;
                }
            }
            c18730l.mopub(jAmazon);
        }
        if (z) {
            return;
        }
        m3864l();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x009f A[LOOP:2: B:24:0x0071->B:35:0x009f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x00a2 A[EDGE_INSN: B:44:0x00a2->B:36:0x00a2 BREAK  A[LOOP:2: B:24:0x0071->B:35:0x009f], SYNTHETIC] */
    /* JADX INFO: renamed from: lٕؓۡ, reason: contains not printable characters */
    public final void m1979l() {
        char c;
        long j;
        long j2;
        C18730l c18730l = this.f13105l;
        Object[] objArr = c18730l.crashlytics;
        long[] jArr = c18730l.yandex;
        int length = jArr.length - 2;
        char c2 = 7;
        if (length >= 0) {
            int i = 0;
            j = 128;
            while (true) {
                long j3 = jArr[i];
                j2 = 255;
                if ((((~j3) << c2) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    int i3 = 0;
                    while (i3 < i2) {
                        if ((j3 & 255) < 128) {
                            ((InterfaceC7042l) objArr[(i << 3) + i3]).ads(null);
                        }
                        j3 >>= 8;
                        i3++;
                        c2 = c2;
                    }
                    c = c2;
                    if (i2 != 8) {
                        break;
                    }
                } else {
                    c = c2;
                }
                if (i == length) {
                    break;
                }
                i++;
                c2 = c;
            }
        } else {
            c = 7;
            j = 128;
            j2 = 255;
        }
        c18730l.yandex();
        C18730l c18730l2 = this.f13107l;
        Object[] objArr2 = c18730l2.crashlytics;
        long[] jArr2 = c18730l2.yandex;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i4 = 0;
            while (true) {
                long j4 = jArr2[i4];
                if ((((~j4) << c) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i4 != length2) {
                        break;
                        break;
                    }
                    i4++;
                } else {
                    int i5 = 8 - ((~(i4 - length2)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((j4 & j2) < j) {
                            ((AbstractC7740l) objArr2[(i4 << 3) + i6]).getClass();
                            throw null;
                        }
                        j4 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    } else if (i4 != length2) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
        }
        c18730l2.yandex();
    }

    /* JADX INFO: renamed from: lؓۤٚ, reason: contains not printable characters */
    public final void m1980l(boolean z) {
        if (z) {
            this.f13104l = null;
            C7504l c7504l = this.f13103l;
            if (c7504l != null) {
                c7504l.ads(null);
            }
            this.f13103l = null;
            C7504l c7504l2 = this.f13111l;
            if (c7504l2 != null) {
                c7504l2.ads(null);
            }
            this.f13111l = null;
            this.f13113l = false;
            this.f13109l = false;
            this.f13114l = -1L;
            this.f13117l = false;
        } else {
            this.f13101l = null;
            C7504l c7504l3 = this.f13108l;
            if (c7504l3 != null) {
                c7504l3.ads(null);
            }
            this.f13108l = null;
            C7504l c7504l4 = this.f13112l;
            if (c7504l4 != null) {
                c7504l4.ads(null);
            }
            this.f13112l = null;
            this.f13110l = false;
            this.f13102l = false;
            this.f13116l = -1L;
            this.f13118l = false;
        }
        m3870l(z);
    }

    /* JADX INFO: renamed from: lؙؗٗ, reason: contains not printable characters */
    public final void m1981l(long j, C14153l c14153l) {
        if (this.f28514l && !this.f13117l) {
            m3866l(c14153l.crashlytics, true);
            this.f13114l = j;
            if (!this.f13109l && !this.f13113l) {
                m3864l();
            }
        }
        this.f13104l = null;
        this.f13117l = false;
        this.f13113l = false;
        C7504l c7504l = this.f13103l;
        if (c7504l != null) {
            c7504l.ads(null);
        }
        this.f13103l = null;
        this.f13109l = false;
    }

    @Override // defpackage.AbstractC14569l
    /* JADX INFO: renamed from: lؚؚؔ, reason: contains not printable characters */
    public final void mo1982l() {
        m1979l();
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lًٚٔ */
    public final void mo513l() {
        m1979l();
    }

    @Override // defpackage.AbstractC14569l
    /* JADX INFO: renamed from: lُٔۨ, reason: contains not printable characters */
    public final boolean mo1983l(KeyEvent keyEvent) {
        long jAmazon = AbstractC16422l.amazon(keyEvent);
        boolean z = false;
        if (this.f13106l != null) {
            C18730l c18730l = this.f13105l;
            if (c18730l.purchase(jAmazon) == null) {
                c18730l.subs(jAmazon, AbstractC10999l.mopub(m3914l(), null, 0, new C7785l(this, null, 2), 3));
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: lْؕ۠, reason: contains not printable characters */
    public final void m1984l(long j, C15730l c15730l) {
        if (this.f28514l && !this.f13118l) {
            m3866l(c15730l.crashlytics, false);
            this.f13116l = j;
            if (!this.f13102l && !this.f13110l) {
                m3864l();
            }
        }
        this.f13101l = null;
        this.f13118l = false;
        this.f13110l = false;
        C7504l c7504l = this.f13108l;
        if (c7504l != null) {
            c7504l.ads(null);
        }
        this.f13108l = null;
        this.f13102l = false;
    }

    @Override // defpackage.AbstractC14569l
    /* JADX INFO: renamed from: l٘ۦۢ */
    public final void mo1507l(InterfaceC17593l interfaceC17593l) {
        if (this.f13106l != null) {
            String str = this.f13115l;
            C13802l c13802l = new C13802l(11, this);
            InterfaceC13922l[] interfaceC13922lArr = AbstractC3668l.yandex;
            interfaceC17593l.amazon(AbstractC16601l.crashlytics, new C7629l(str, c13802l));
        }
    }

    @Override // defpackage.InterfaceC17612l
    public final void signatures(C13698l c13698l, EnumC9065l enumC9065l) {
        ArrayList arrayList = (ArrayList) c13698l.f26743l;
        m3868l();
        if (this.f28514l && this.f28526l == null) {
            C18395l c18395l = new C18395l(this);
            m3069l(c18395l);
            this.f28526l = c18395l;
        }
        int i = 0;
        if (enumC9065l != EnumC9065l.f18653l) {
            if (enumC9065l != EnumC9065l.f18652l || this.f13104l == null || this.f13109l) {
                return;
            }
            int size = arrayList.size();
            while (i < size) {
                C14153l c14153l = (C14153l) arrayList.get(i);
                if (c14153l.subs && c14153l != this.f13104l) {
                    m1980l(true);
                    return;
                }
                i++;
            }
            return;
        }
        if (this.f13104l == null) {
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (AbstractC17764l.loadAd((C14153l) arrayList.get(i2))) {
                    C14153l c14153l2 = (C14153l) arrayList.get(0);
                    c14153l2.subs = true;
                    this.f13104l = c14153l2;
                    if (this.f28514l) {
                        C7504l c7504l = this.f13111l;
                        if (c7504l != null && c7504l.mopub()) {
                            ((InterfaceC3114l) AbstractC13402l.loadAd(this, AbstractC4751l.tapsense)).getClass();
                            if (c14153l2.loadAd - this.f13114l < 40) {
                                this.f13117l = true;
                                return;
                            }
                            this.f13113l = true;
                            C7504l c7504l2 = this.f13111l;
                            if (c7504l2 != null) {
                                c7504l2.ads(null);
                            }
                            this.f13111l = null;
                        }
                        this.f13109l = false;
                        m3867l(c14153l2);
                        if (this.f13106l != null) {
                            this.f13103l = AbstractC10999l.mopub(m3914l(), null, 0, new C7785l(this, null, 1), 3);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (this.f13109l) {
            int size3 = arrayList.size();
            for (int i3 = 0; i3 < size3; i3++) {
                C14153l c14153l3 = (C14153l) arrayList.get(i3);
                if (!c14153l3.admob || c14153l3.amazon) {
                    int size4 = arrayList.size();
                    while (i < size4) {
                        ((C14153l) arrayList.get(i)).subs = true;
                        i++;
                    }
                    return;
                }
            }
            C14153l c14153l4 = (C14153l) arrayList.get(0);
            c14153l4.subs = true;
            m1981l(c14153l4.loadAd, this.f13104l);
            return;
        }
        int size5 = arrayList.size();
        for (int i4 = 0; i4 < size5; i4++) {
            C14153l c14153l5 = (C14153l) arrayList.get(i4);
            if (c14153l5.subs || !c14153l5.admob || c14153l5.amazon) {
                float fBilling = ((InterfaceC3114l) AbstractC13402l.loadAd(this, AbstractC4751l.tapsense)).billing();
                int size6 = arrayList.size();
                for (int i5 = 0; i5 < size6; i5++) {
                    C14153l c14153l6 = (C14153l) arrayList.get(i5);
                    boolean z = Math.abs(C1187l.crashlytics(C1187l.admob(c14153l6.crashlytics, this.f13104l.crashlytics))) > fBilling;
                    if (c14153l6.subs || z) {
                        m1980l(true);
                        return;
                    }
                }
                return;
            }
        }
        C14153l c14153l7 = (C14153l) arrayList.get(0);
        c14153l7.subs = true;
        m1981l(c14153l7.loadAd, this.f13104l);
    }

    @Override // defpackage.InterfaceC13202l
    /* JADX INFO: renamed from: throw */
    public final void mo1500throw() {
        C0261l c0261l;
        C2403l c2403l = this.f28520l;
        if (c2403l != null && (c0261l = this.f28529l) != null) {
            c2403l.loadAd(new C12134l(c0261l));
        }
        this.f28529l = null;
        m1980l(false);
    }

    @Override // defpackage.InterfaceC17612l
    /* JADX INFO: renamed from: try, reason: not valid java name */
    public final void mo1985try() {
        m1980l(true);
    }
}
