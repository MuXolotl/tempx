package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.metrica;
import androidx.recyclerview.widget.subs;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: lٔؒٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC14630l extends subs {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public LayoutInflater f28629l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C12552l f28630l;

    public AbstractC14630l() {
        C6928l c6928l = new C6928l(25);
        C6824l c6824l = new C6824l(this);
        C5008l c5008l = new C5008l(1, this);
        synchronized (C0516l.f1836l) {
            try {
                if (C0516l.f1835l == null) {
                    C0516l.f1835l = Executors.newFixedThreadPool(2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C12552l c12552l = new C12552l(c5008l, new C10023l((Object) C0516l.f1835l, (Object) c6928l, false));
        this.f28630l = c12552l;
        c12552l.amazon.add(c6824l);
    }

    @Override // androidx.recyclerview.widget.subs
    public final void ads(metrica metricaVar, int i) {
        C8813l c8813l = (C8813l) metricaVar;
        signatures(i, this.f28630l.billing.get(i), c8813l.Signature, c8813l);
    }

    public abstract int applovin();

    public void appmetrica(List list) {
        C12552l c12552l = this.f28630l;
        C5008l c5008l = c12552l.yandex;
        int i = c12552l.mopub + 1;
        c12552l.mopub = i;
        List list2 = c12552l.purchase;
        if (list == list2) {
            return;
        }
        if (list == null) {
            int size = list2.size();
            c12552l.purchase = null;
            c12552l.billing = Collections.EMPTY_LIST;
            c5008l.remoteconfig(0, size);
            c12552l.yandex();
            return;
        }
        if (list2 != null) {
            ((Executor) c12552l.loadAd.f20419l).execute(new RunnableC15098l(c12552l, list2, list, i));
            return;
        }
        c12552l.purchase = list;
        c12552l.billing = DesugarCollections.unmodifiableList(list);
        c5008l.admob(0, list.size());
        c12552l.yandex();
    }

    @Override // androidx.recyclerview.widget.subs
    public final int mopub() {
        return this.f28630l.billing.size();
    }

    public abstract InterfaceC0589l premium(LayoutInflater layoutInflater, ViewGroup viewGroup);

    public void signatures(int i, Object obj, InterfaceC0589l interfaceC0589l, C8813l c8813l) {
        isVip(i, obj, interfaceC0589l);
    }

    @Override // androidx.recyclerview.widget.subs
    public final int subs(int i) {
        return applovin();
    }

    @Override // androidx.recyclerview.widget.subs
    public final metrica tapsense(ViewGroup viewGroup, int i) {
        if (this.f28629l == null) {
            this.f28629l = LayoutInflater.from(viewGroup.getContext());
        }
        LayoutInflater layoutInflater = this.f28629l;
        if (layoutInflater == null) {
            layoutInflater = null;
        }
        return new C8813l(premium(layoutInflater, viewGroup));
    }

    public void isVip(int i, Object obj, InterfaceC0589l interfaceC0589l) {
    }
}
