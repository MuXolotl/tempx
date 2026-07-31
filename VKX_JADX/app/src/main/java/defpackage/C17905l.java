package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.subs;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: l٘ٓٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17905l extends AbstractC5555l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final int f34858l = R.layout.v7_playlist_header_buttonbar;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final subs f34859l;

    public C17905l(subs subsVar) {
        this.f34859l = subsVar;
    }

    @Override // defpackage.AbstractC5555l
    public final void isVip(int i, InterfaceC0589l interfaceC0589l) {
        RecyclerView recyclerView = ((C5516l) interfaceC0589l).f11784l;
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0));
        recyclerView.setAdapter(this.f34859l);
    }

    @Override // androidx.recyclerview.widget.subs
    public final int mopub() {
        return 1;
    }

    @Override // defpackage.AbstractC5555l
    public final int premium() {
        return this.f34858l;
    }

    @Override // defpackage.AbstractC5555l
    public final InterfaceC0589l signatures(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.c2_slider_freeform, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) AbstractC8576l.smaato(viewInflate, R.id.recycler_view);
        if (recyclerView != null) {
            return new C5516l((LinearLayout) viewInflate, recyclerView);
        }
        C6541l.subs("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.recycler_view)));
        return null;
    }
}
