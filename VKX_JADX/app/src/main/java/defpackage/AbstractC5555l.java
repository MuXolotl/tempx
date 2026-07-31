package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.metrica;
import androidx.recyclerview.widget.subs;

/* JADX INFO: renamed from: lٌؘٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5555l extends subs {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public LayoutInflater f11839l;

    @Override // androidx.recyclerview.widget.subs
    public final long admob(int i) {
        return -1L;
    }

    @Override // androidx.recyclerview.widget.subs
    public final void ads(metrica metricaVar, int i) {
        isVip(i, ((C18013l) metricaVar).Signature);
    }

    public abstract void isVip(int i, InterfaceC0589l interfaceC0589l);

    public abstract int premium();

    public abstract InterfaceC0589l signatures(LayoutInflater layoutInflater, ViewGroup viewGroup);

    @Override // androidx.recyclerview.widget.subs
    public int subs(int i) {
        return premium();
    }

    @Override // androidx.recyclerview.widget.subs
    public final metrica tapsense(ViewGroup viewGroup, int i) {
        if (this.f11839l == null) {
            this.f11839l = LayoutInflater.from(viewGroup.getContext());
        }
        LayoutInflater layoutInflater = this.f11839l;
        if (layoutInflater == null) {
            layoutInflater = null;
        }
        return new C18013l(signatures(layoutInflater, viewGroup));
    }
}
