package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: lِٕۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC15988l extends AbstractC17777l {
    @Override // defpackage.AbstractC17777l
    public final View applovin(ViewGroup viewGroup) {
        return mo1141catch(LayoutInflater.from(isVip()), viewGroup);
    }

    /* JADX INFO: renamed from: catch */
    public abstract View mo1141catch(LayoutInflater layoutInflater, ViewGroup viewGroup);

    /* JADX INFO: renamed from: extends */
    public abstract void mo1144extends(int i);

    /* JADX INFO: renamed from: for */
    public abstract void mo1145for(int i);

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final void m4125private(AbstractC17777l abstractC17777l) {
        this.f34613l.remoteconfig(abstractC17777l);
    }

    @Override // defpackage.AbstractC17777l
    /* JADX INFO: renamed from: volatile */
    public void mo783volatile(View view) {
        this.f34611l = view;
        mo3092else(view);
    }

    /* JADX INFO: renamed from: else */
    public void mo3092else(View view) {
    }
}
