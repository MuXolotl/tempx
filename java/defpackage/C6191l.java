package defpackage;

import java.util.List;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lٍؙؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6191l implements InterfaceC17069l {
    public static final C6191l yandex = new C6191l();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C6191l);
    }

    @Override // defpackage.InterfaceC17069l
    public final int getTitle() {
        return R.string.library_mass_action_download;
    }

    public final int hashCode() {
        return 207969871;
    }

    public final String toString() {
        return "Download";
    }

    @Override // defpackage.InterfaceC17069l
    public final void yandex(AppActivity appActivity, VKProfile vKProfile, List list) {
        String strAmazon;
        StringBuilder sb = new StringBuilder("Библиотека профиля ");
        if (vKProfile == null || (strAmazon = vKProfile.yandex()) == null) {
            C16287l.yandex.getClass();
            strAmazon = C16287l.amazon();
        }
        sb.append(strAmazon);
        AbstractC11397l.mopub(appActivity, new C9810l(sb.toString(), list, 10));
    }
}
