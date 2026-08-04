package defpackage;

import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lّۥۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C12981l extends AbstractC14569l {

    /* JADX INFO: renamed from: lؖ۠ٙ, reason: contains not printable characters */
    public C14153l f25437l;

    /* JADX INFO: renamed from: lؘْٙ, reason: contains not printable characters */
    public C15730l f25438l;

    @Override // defpackage.AbstractC14569l, defpackage.InterfaceC13202l
    public final void appmetrica(C9185l c9185l, EnumC9065l enumC9065l, long j) {
        super.appmetrica(c9185l, enumC9065l, j);
        if (enumC9065l != EnumC9065l.f18653l) {
            if (enumC9065l == EnumC9065l.f18652l) {
                if (this.f25438l != null) {
                    List list = c9185l.yandex;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        C15730l c15730l = (C15730l) list.get(i);
                        if (c15730l.crashlytics() && c15730l != this.f25438l) {
                            m3514l(false);
                            break;
                        }
                    }
                }
                if (AbstractC8576l.yandex(this.f28513l, "recognized")) {
                    this.f28513l = "idle";
                    return;
                }
                return;
            }
            return;
        }
        if (this.f25438l == null) {
            if (AbstractC18112l.billing(c9185l, true, false)) {
                C15730l c15730l2 = (C15730l) c9185l.yandex.get(0);
                c15730l2.yandex();
                this.f25438l = c15730l2;
                if (this.f28514l) {
                    this.f28513l = "waiting";
                    m3863l(c15730l2);
                    return;
                }
                return;
            }
            return;
        }
        List list2 = c9185l.yandex;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (!AbstractC3474l.purchase((C15730l) list2.get(i2))) {
                long jM3869l = m3869l(j);
                int size3 = list2.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    C15730l c15730l3 = (C15730l) list2.get(i3);
                    if (c15730l3.crashlytics() || AbstractC3474l.admob(c15730l3, j, jM3869l)) {
                        m3514l(false);
                        return;
                    }
                }
                return;
            }
        }
        ((C15730l) list2.get(0)).yandex();
        if (this.f28514l) {
            this.f28513l = "recognized";
            m3866l(this.f25438l.crashlytics, false);
            m3864l();
        }
        this.f25438l = null;
    }

    @Override // defpackage.AbstractC14569l
    /* JADX INFO: renamed from: lؓۚ۟ */
    public final void mo1978l(KeyEvent keyEvent) {
        m3864l();
    }

    /* JADX INFO: renamed from: lؓۤٚ, reason: contains not printable characters */
    public final void m3514l(boolean z) {
        if (z) {
            this.f25437l = null;
        } else {
            this.f25438l = null;
        }
        m3870l(z);
        this.f28513l = "idle";
    }

    @Override // defpackage.AbstractC14569l
    /* JADX INFO: renamed from: lُٔۨ */
    public final boolean mo1983l(KeyEvent keyEvent) {
        return false;
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
        if (enumC9065l != EnumC9065l.f18653l) {
            if (enumC9065l == EnumC9065l.f18652l) {
                if (this.f25437l != null) {
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        C14153l c14153l = (C14153l) arrayList.get(i);
                        if (c14153l.subs && c14153l != this.f25437l) {
                            m3514l(true);
                            break;
                        }
                    }
                }
                if (AbstractC8576l.yandex(this.f28513l, "recognized")) {
                    this.f28513l = "idle";
                    return;
                }
                return;
            }
            return;
        }
        if (this.f25437l == null) {
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (AbstractC17764l.loadAd((C14153l) arrayList.get(i2))) {
                    C14153l c14153l2 = (C14153l) arrayList.get(0);
                    c14153l2.subs = true;
                    this.f25437l = c14153l2;
                    if (this.f28514l) {
                        this.f28513l = "waiting";
                        m3867l(c14153l2);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            C14153l c14153l3 = (C14153l) arrayList.get(i3);
            if (c14153l3.subs || !c14153l3.admob || c14153l3.amazon) {
                float fBilling = ((InterfaceC3114l) AbstractC13402l.loadAd(this, AbstractC4751l.tapsense)).billing();
                int size4 = arrayList.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    C14153l c14153l4 = (C14153l) arrayList.get(i4);
                    boolean z = Math.abs(C1187l.crashlytics(C1187l.admob(c14153l4.crashlytics, this.f25437l.crashlytics))) > fBilling;
                    if (c14153l4.subs || z) {
                        m3514l(true);
                        return;
                    }
                }
                return;
            }
        }
        ((C14153l) arrayList.get(0)).subs = true;
        if (this.f28514l) {
            this.f28513l = "recognized";
            m3866l(this.f25437l.crashlytics, true);
            m3864l();
        }
        this.f25437l = null;
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
        m3514l(false);
    }

    @Override // defpackage.InterfaceC17612l
    /* JADX INFO: renamed from: try */
    public final void mo1985try() {
        m3514l(true);
    }
}
