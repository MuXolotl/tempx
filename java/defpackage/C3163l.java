package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: lؕؔۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3163l extends AbstractC14384l {
    public final C2432l admob;
    public final C5978l isPro;
    public final C2427l metrica;
    public final C14513l smaato;
    public C7713l startapp;
    public final InterfaceC0587l subs;
    public final C8564l vip;
    public final long firebase = -9223372036854775807L;
    public final boolean remoteconfig = true;

    public C3163l(C9749l c9749l, InterfaceC0587l interfaceC0587l, C14513l c14513l) {
        C17805l c17805l;
        this.subs = interfaceC0587l;
        this.smaato = c14513l;
        boolean z = true;
        C0935l c0935l = new C0935l();
        C17464l c17464l = new C17464l();
        List list = Collections.EMPTY_LIST;
        C13708l c13708l = C13708l.f26763l;
        C2410l c2410l = new C2410l();
        C11470l c11470l = C11470l.amazon;
        Uri uri = Uri.EMPTY;
        String string = c9749l.yandex.toString();
        string.getClass();
        AbstractC1186l abstractC1186lSignature = AbstractC1186l.Signature(AbstractC1186l.isVip(c9749l));
        if (((Uri) c17464l.purchase) != null && ((UUID) c17464l.amazon) == null) {
            z = false;
        }
        AbstractC12442l.subscription(z);
        if (uri != null) {
            c17805l = new C17805l(uri, null, ((UUID) c17464l.amazon) != null ? new C14227l(c17464l) : null, null, list, null, abstractC1186lSignature, null, -9223372036854775807L);
        } else {
            c17805l = null;
        }
        C2427l c2427l = new C2427l(string, new C9202l(c0935l), c17805l, new C7828l(c2410l), C3852l.f7980private, c11470l);
        this.metrica = c2427l;
        C12984l c12984l = new C12984l();
        String str = c9749l.loadAd;
        c12984l.vip = AbstractC3825l.vip(str == null ? "text/x-unknown" : str);
        c12984l.amazon = c9749l.crashlytics;
        c12984l.purchase = c9749l.amazon;
        c12984l.billing = c9749l.purchase;
        c12984l.loadAd = c9749l.billing;
        String str2 = c9749l.mopub;
        c12984l.yandex = str2 != null ? str2 : null;
        this.isPro = new C5978l(c12984l);
        Map map = Collections.EMPTY_MAP;
        Uri uri2 = c9749l.yandex;
        AbstractC12442l.metrica(uri2, "The uri must be set.");
        this.admob = new C2432l(uri2, 0L, 1, null, map, 0L, -1L, null, 1, null);
        this.vip = new C8564l(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, 0L, 0L, true, false, false, null, c2427l, null);
    }

    @Override // defpackage.AbstractC14384l
    public final C2427l admob() {
        return this.metrica;
    }

    @Override // defpackage.AbstractC14384l
    public final InterfaceC8782l loadAd(C5019l c5019l, InterfaceC3783l interfaceC3783l, long j) {
        return new C2615l(this.admob, this.subs, this.startapp, this.isPro, this.firebase, this.smaato, new C13698l((CopyOnWriteArrayList) this.crashlytics.f26746l, 0, c5019l), this.remoteconfig, null);
    }

    @Override // defpackage.AbstractC14384l
    public final void smaato(C7713l c7713l) {
        this.startapp = c7713l;
        remoteconfig(this.vip);
    }

    @Override // defpackage.AbstractC14384l
    public final void vip(InterfaceC8782l interfaceC8782l) {
        ((C2615l) interfaceC8782l).f5688l.m4549new(null);
    }

    @Override // defpackage.AbstractC14384l
    public final void isPro() {
    }

    @Override // defpackage.AbstractC14384l
    public final void startapp() {
    }
}
