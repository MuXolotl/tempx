package defpackage;

import android.content.Context;
import android.widget.Toast;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lٔۡۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C15245l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ String f29839l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Context f29840l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f29841l;

    public /* synthetic */ C15245l(int i, Context context, String str) {
        this.f29841l = i;
        this.f29840l = context;
        this.f29839l = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f29841l;
        String str = this.f29839l;
        Context context = this.f29840l;
        switch (i) {
            case 0:
                boolean z = context instanceof AppActivity;
                String str2 = this.f29839l;
                if (z) {
                    C6666l.yandex((AppActivity) context, new C10734l(null, context.getString(R.string.notification), str2, null, null, 249));
                } else {
                    Toast.makeText(context, str2, 1).show();
                }
                return Unit.INSTANCE;
            case 1:
                return AbstractC2632l.amazon(context, str);
            case 2:
                return AbstractC2632l.amazon(context, str);
            case 3:
                return context.getSharedPreferences(str, 0);
            default:
                return AbstractC2632l.amazon(context, str);
        }
    }
}
