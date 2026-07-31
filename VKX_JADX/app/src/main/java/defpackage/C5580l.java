package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lٍؘۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5580l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ AppActivity f11851l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5580l(AppActivity appActivity, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f11851l = appActivity;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        AbstractC2829l.crashlytics(obj);
        AppActivity appActivity = this.f11851l;
        AtomicBoolean atomicBoolean = appActivity.f36638l;
        if (atomicBoolean.get()) {
            atomicBoolean.set(false);
            Integer num = new Integer(R.drawable.ic_download_outline_28);
            VKXApplication vKXApplication = VKXApplication.f36631l;
            if (vKXApplication == null) {
                vKXApplication = null;
            }
            String string = vKXApplication.getString(R.string.cache_db_migration_completed);
            VKXApplication vKXApplication2 = VKXApplication.f36631l;
            C6666l.yandex(appActivity, new C10734l(num, string, (vKXApplication2 != null ? vKXApplication2 : null).getString(R.string.cache_db_migration_completed_desc), null, null, 208));
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        return new C5580l(this.f11851l, interfaceC14029l);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C5580l) ads((InterfaceC14029l) obj2, (C15021l) obj)).Signature(Unit.INSTANCE);
    }
}
