package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.isPro;
import defpackage.C4485l;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lۣؑؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0663l extends AbstractC5555l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final int f2133l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final int f2134l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final AbstractC14630l f2135l;

    public C0663l(int i, AbstractC14630l abstractC14630l) {
        this.f2134l = i;
        this.f2135l = abstractC14630l;
        VKXApplication.Companion companion = VKXApplication.f36628l;
        this.f2133l = VKXApplication.Companion.yandex(16.0f);
    }

    @Override // defpackage.AbstractC5555l
    public final void isVip(int i, InterfaceC0589l interfaceC0589l) {
        isPro linearLayoutManager;
        C13625l c13625l;
        RecyclerView recyclerView = ((C14399l) interfaceC0589l).f28153l;
        int i2 = this.f2134l;
        int iInmobi = AbstractC5020l.inmobi(i2);
        AbstractC14630l abstractC14630l = this.f2135l;
        if (iInmobi == 0) {
            recyclerView.getContext();
            linearLayoutManager = new LinearLayoutManager(0);
        } else if (iInmobi == 1) {
            recyclerView.getContext();
            int iMopub = abstractC14630l.mopub();
            if (iMopub != 1 && iMopub != 2) {
                iMopub = 3;
            }
            linearLayoutManager = new GridLayoutManager(iMopub, 0);
        } else if (iInmobi != 2) {
            C18725l.billing();
            return;
        } else {
            recyclerView.getContext();
            linearLayoutManager = new LinearLayoutManager() { // from class: bruhcollective.itaysonlab.libcatalog.blocks.adapters.SliderAdapter$SliderLayoutManager
                public final C4485l inmobi = new C4485l();

                @Override // androidx.recyclerview.widget.isPro
                /* JADX INFO: renamed from: interface */
                public final void mo132interface(RecyclerView recyclerView2) {
                    this.inmobi.yandex(recyclerView2);
                }

                @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.isPro
                /* JADX INFO: renamed from: static */
                public final void mo90static(RecyclerView recyclerView2) {
                    this.inmobi.yandex(null);
                }
            };
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(abstractC14630l);
        if (recyclerView.getItemDecorationCount() > 0) {
            recyclerView.removeItemDecorationAt(0);
        }
        if (AbstractC11858l.yandex[AbstractC5020l.inmobi(i2)] == 1) {
            c13625l = new C13625l(this.f2133l, !(abstractC14630l instanceof C17022l));
        } else {
            c13625l = null;
        }
        if (c13625l != null) {
            recyclerView.addItemDecoration(c13625l);
        }
    }

    @Override // androidx.recyclerview.widget.subs
    public final int mopub() {
        return 1;
    }

    @Override // defpackage.AbstractC5555l
    public final int premium() {
        return this.f2135l.applovin() + R.id.slider;
    }

    @Override // defpackage.AbstractC5555l
    public final InterfaceC0589l signatures(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.c2_slider, viewGroup, false);
        if (viewInflate != null) {
            RecyclerView recyclerView = (RecyclerView) viewInflate;
            return new C14399l(recyclerView, recyclerView);
        }
        C6541l.subs("rootView");
        return null;
    }
}
