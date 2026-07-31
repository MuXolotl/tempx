package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import ua.itaysonlab.vkapi2.objects.music.AudioBook;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lّؑؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12302l extends AbstractC14630l {
    @Override // defpackage.AbstractC14630l
    public final int applovin() {
        return R.layout.list_item_playlist_no_subtitle;
    }

    @Override // defpackage.AbstractC14630l
    public final void isVip(int i, Object obj, InterfaceC0589l interfaceC0589l) {
        AudioBook audioBook = (AudioBook) obj;
        C5182l c5182l = (C5182l) interfaceC0589l;
        c5182l.f11251l.setOnClickListener(new ViewOnClickListenerC6621l(audioBook, 0));
        AbstractC17891l.crashlytics(c5182l.f11249l, AbstractC8320l.loadAd(300, audioBook.adcel), Integer.valueOf(R.drawable.placeholder_playlist), new C10923l(new C6985l(8.0f), 14));
        c5182l.f11252l.setText(audioBook.admob);
        c5182l.f11250l.setText(AbstractC16901l.m4210case(audioBook.billing, null, null, null, new C17049l(11), 31));
    }

    @Override // defpackage.AbstractC14630l
    public final InterfaceC0589l premium(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C5182l.yandex(layoutInflater, viewGroup);
    }
}
