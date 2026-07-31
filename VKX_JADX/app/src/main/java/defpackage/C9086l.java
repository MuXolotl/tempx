package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import ua.itaysonlab.vkapi2.objects.music.AudioBook;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٌ۟ۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9086l extends AbstractC14630l {
    @Override // defpackage.AbstractC14630l
    public final int applovin() {
        return R.layout.list_item_playlist_horizontal;
    }

    @Override // defpackage.AbstractC14630l
    public final void isVip(int i, Object obj, InterfaceC0589l interfaceC0589l) {
        AudioBook audioBook = (AudioBook) obj;
        C15896l c15896l = (C15896l) interfaceC0589l;
        c15896l.f31175l.setOnClickListener(new ViewOnClickListenerC6621l(audioBook, 1));
        AbstractC17891l.crashlytics(c15896l.f31177l, AbstractC8320l.loadAd(300, audioBook.adcel), Integer.valueOf(R.drawable.placeholder_playlist), new C10923l(new C6985l(8.0f), 14));
        c15896l.f31178l.setText(audioBook.admob);
        c15896l.f31174l.setText(AbstractC16901l.m4210case(audioBook.billing, null, null, null, new C10949l(9), 31));
        AbstractC5833l.purchase(c15896l.f31176l);
        AbstractC5833l.purchase(c15896l.f31173l);
    }

    @Override // defpackage.AbstractC14630l
    public final InterfaceC0589l premium(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C15896l.yandex(layoutInflater, viewGroup);
    }
}
