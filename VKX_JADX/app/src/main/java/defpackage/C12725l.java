package defpackage;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import kotlin.jvm.functions.Function6;

/* JADX INFO: renamed from: lّٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C12725l extends C1538l implements Function6 {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C12725l f25094l = new C12725l(6, AbstractC9151l.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);

    @Override // kotlin.jvm.functions.Function6
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Context context = (Context) obj;
        C12211l c12211l = (C12211l) obj2;
        C3307l c3307l = (C3307l) obj3;
        C5648l c5648l = (C5648l) obj6;
        String str = AbstractC3387l.yandex;
        C9133l c9133l = new C9133l(context, (WorkDatabase) obj4, c12211l);
        AbstractC12357l.yandex(context, SystemJobService.class, true);
        C14513l.tapsense().vip(AbstractC3387l.yandex, "Created SystemJobScheduler and enabled SystemJobService");
        return AbstractC14055l.remoteconfig(c9133l, new C15316l(context, c12211l, (C13312l) obj5, c5648l, new C5633l(c5648l, c3307l, 3), c3307l));
    }
}
