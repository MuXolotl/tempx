package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lؖٛؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4228l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C7711l f8661l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f8662l;

    public /* synthetic */ C4228l(C7711l c7711l, int i) {
        this.f8662l = i;
        this.f8661l = c7711l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f8662l;
        int i2 = 2;
        int i3 = 0;
        int i4 = 1;
        C7711l c7711l = this.f8661l;
        switch (i) {
            case 0:
                C13856l c13856l = (C13856l) ((InterfaceC13742l) obj);
                c13856l.yandex(R.string.action_audio_addtoplaylist, R.drawable.ic_list_add_outline_28, new C3787l(c7711l, i4));
                c13856l.yandex(R.string.action_audio_playnext, R.drawable.ic_list_play_outline_28, new C3787l(c7711l, i2));
                c13856l.yandex(R.string.action_audio_cache, R.drawable.ic_playlist_cached_36, new C3787l(c7711l, 3));
                c13856l.yandex(R.string.action_audio_dl, R.drawable.ic_download_outline_28, new C3787l(c7711l, 4));
                if (((ArrayList) ((C18480l) c7711l.f16189l.f21748l).f36087l).size() <= 20) {
                    c13856l.yandex(R.string.action_audio_remove, R.drawable.ic_delete_outline_android_28, new C3787l(c7711l, 5));
                }
                break;
            case 1:
                List list = (List) obj;
                C9312l c9312l = new C9312l(c7711l.isVip());
                C14225l c14225l = (C14225l) c9312l.f28907l;
                c14225l.amazon = c14225l.yandex.getText(R.string.confirm);
                VKXApplication vKXApplication = VKXApplication.f36631l;
                c14225l.billing = (vKXApplication != null ? vKXApplication : null).getString(R.string.library_remove_multi_desc, Integer.valueOf(list.size()));
                c9312l.appmetrica(R.string.remove, new DialogInterfaceOnClickListenerC13033l(c7711l, list, i4));
                c9312l.applovin(R.string.cancel, new DialogInterfaceOnClickListenerC0609l(2));
                c9312l.isVip();
                break;
            case 2:
                int iIntValue = ((Integer) obj).intValue();
                C11560l c11560l = c7711l.f30818l;
                if (c11560l == null) {
                    c11560l = null;
                }
                if (c11560l.getCurrentItem() == iIntValue) {
                    Object obj2 = c7711l.f16188l.get(iIntValue);
                    InterfaceC9909l interfaceC9909l = obj2 instanceof InterfaceC9909l ? (InterfaceC9909l) obj2 : null;
                    if (interfaceC9909l != null) {
                        interfaceC9909l.pro();
                    }
                } else {
                    C11560l c11560l2 = c7711l.f30818l;
                    (c11560l2 != null ? c11560l2 : null).setCurrentItem(iIntValue, true);
                }
                break;
            default:
                new C10038l((View) obj, new C4228l(c7711l, i3)).m2854l();
                break;
        }
        return Unit.INSTANCE;
    }
}
