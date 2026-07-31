package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lّٕۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12931l extends AbstractC5555l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final int f25377l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final int f25378l = 2;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final AbstractC14630l f25379l;

    public C12931l(AbstractC14630l abstractC14630l) {
        this.f25379l = abstractC14630l;
        VKXApplication.Companion companion = VKXApplication.f36628l;
        this.f25377l = VKXApplication.Companion.yandex(16.0f);
    }

    @Override // defpackage.AbstractC5555l
    public final void isVip(int i, InterfaceC0589l interfaceC0589l) {
        RecyclerView recyclerView = ((C14399l) interfaceC0589l).f28153l;
        recyclerView.getContext();
        AbstractC14630l abstractC14630l = this.f25379l;
        int iMopub = abstractC14630l.mopub();
        if (iMopub != 1 && iMopub != 2) {
            iMopub = this.f25378l;
        }
        recyclerView.setLayoutManager(new GridLayoutManager(iMopub, 1));
        recyclerView.setAdapter(abstractC14630l);
        if (recyclerView.getItemDecorationCount() > 0) {
            recyclerView.removeItemDecorationAt(0);
        }
        recyclerView.addItemDecoration(new C8158l(this.f25377l));
    }

    @Override // androidx.recyclerview.widget.subs
    public final int mopub() {
        return 1;
    }

    @Override // defpackage.AbstractC5555l
    public final int premium() {
        return this.f25379l.applovin() + R.id.slider;
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
