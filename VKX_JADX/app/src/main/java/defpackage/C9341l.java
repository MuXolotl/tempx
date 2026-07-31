package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import ua.itaysonlab.vkapi2.objects.newsfeed.NewsfeedItem;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٍؖۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9341l extends AbstractC5555l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final NewsfeedItem f19161l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final VKProfile f19162l;

    public C9341l(NewsfeedItem newsfeedItem, VKProfile vKProfile) {
        this.f19161l = newsfeedItem;
        this.f19162l = vKProfile;
    }

    @Override // defpackage.AbstractC5555l
    public final void isVip(int i, InterfaceC0589l interfaceC0589l) {
        C16354l c16354l = (C16354l) interfaceC0589l;
        ImageView imageView = c16354l.f31981l;
        VKProfile vKProfile = this.f19162l;
        AbstractC17891l.crashlytics(imageView, vKProfile.amazon, Integer.valueOf(R.drawable.placeholder_link), new C10923l(new C16849l(), 14));
        c16354l.f31980l.setText(vKProfile.yandex());
        TextView textView = c16354l.f31984l;
        Context context = c16354l.f31983l.getContext();
        Long l = this.f19161l.mopub;
        textView.setText(AbstractC7076l.amazon(context, l != null ? l.longValue() : System.currentTimeMillis()));
    }

    @Override // androidx.recyclerview.widget.subs
    public final int mopub() {
        return 1;
    }

    @Override // defpackage.AbstractC5555l
    public final int premium() {
        return R.layout.v7_post_header;
    }

    @Override // defpackage.AbstractC5555l
    public final InterfaceC0589l signatures(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C16354l.yandex(layoutInflater, viewGroup);
    }
}
