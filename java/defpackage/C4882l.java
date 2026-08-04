package defpackage;

import android.content.Intent;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;

/* JADX INFO: renamed from: lؗٔٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4882l extends AbstractC9963l {
    public final /* synthetic */ WorkDatabase_Impl amazon;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4882l(WorkDatabase_Impl workDatabase_Impl) {
        super("08b926448d86528e697981ddd30459f7", 24, "149fd8ad55885d3fe3549a37a0163243");
        this.amazon = workDatabase_Impl;
    }

    @Override // defpackage.AbstractC9963l
    public final void amazon(InterfaceC0684l interfaceC0684l) {
        AbstractC13628l.amazon(interfaceC0684l, "PRAGMA foreign_keys = ON");
        C15813l c15813l = this.amazon.purchase;
        if (c15813l == null) {
            c15813l = null;
        }
        C17274l c17274l = c15813l.crashlytics;
        c17274l.getClass();
        InterfaceC14742l interfaceC14742lMo668l = interfaceC0684l.mo668l("PRAGMA query_only");
        try {
            interfaceC14742lMo668l.mo827l();
            boolean zMo825goto = interfaceC14742lMo668l.mo825goto();
            AbstractC1214l.yandex(interfaceC14742lMo668l, null);
            if (!zMo825goto) {
                AbstractC13628l.amazon(interfaceC0684l, "PRAGMA temp_store = MEMORY");
                AbstractC13628l.amazon(interfaceC0684l, "PRAGMA recursive_triggers = 1");
                AbstractC13628l.amazon(interfaceC0684l, "DROP TABLE IF EXISTS room_table_modification_log");
                if (c17274l.yandex) {
                    AbstractC13628l.amazon(interfaceC0684l, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    AbstractC13628l.amazon(interfaceC0684l, AbstractC16648l.advert("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", "", false));
                }
                C11919l c11919l = (C11919l) c17274l.admob;
                ReentrantLock reentrantLock = (ReentrantLock) c11919l.f23763l;
                reentrantLock.lock();
                try {
                    c11919l.f23764l = true;
                    Unit unit = Unit.INSTANCE;
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            synchronized (c15813l.isPro) {
                try {
                    C12158l c12158l = c15813l.subs;
                    if (c12158l != null) {
                        Intent intent = c15813l.admob;
                        if (intent == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        c12158l.loadAd(intent);
                        Unit unit2 = Unit.INSTANCE;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC1214l.yandex(interfaceC14742lMo668l, th3);
                throw th4;
            }
        }
    }

    @Override // defpackage.AbstractC9963l
    public final void billing(InterfaceC0684l interfaceC0684l) {
        C10227l c10227lAdmob = AbstractC14055l.admob();
        InterfaceC14742l interfaceC14742lMo668l = interfaceC0684l.mo668l("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (interfaceC14742lMo668l.mo827l()) {
            try {
                c10227lAdmob.add(interfaceC14742lMo668l.mo826implements(0));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC1214l.yandex(interfaceC14742lMo668l, th);
                    throw th2;
                }
            }
        }
        Unit unit = Unit.INSTANCE;
        AbstractC1214l.yandex(interfaceC14742lMo668l, null);
        ListIterator listIterator = AbstractC14055l.purchase(c10227lAdmob).listIterator(0);
        while (true) {
            C13376l c13376l = (C13376l) listIterator;
            if (!c13376l.hasNext()) {
                return;
            }
            String str = (String) c13376l.next();
            if (AbstractC16648l.isVip(str, "room_fts_content_sync_", false)) {
                AbstractC13628l.amazon(interfaceC0684l, "DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }

    @Override // defpackage.AbstractC9963l
    public final void loadAd(InterfaceC0684l interfaceC0684l) {
        AbstractC13628l.amazon(interfaceC0684l, "DROP TABLE IF EXISTS `Dependency`");
        AbstractC13628l.amazon(interfaceC0684l, "DROP TABLE IF EXISTS `WorkSpec`");
        AbstractC13628l.amazon(interfaceC0684l, "DROP TABLE IF EXISTS `WorkTag`");
        AbstractC13628l.amazon(interfaceC0684l, "DROP TABLE IF EXISTS `SystemIdInfo`");
        AbstractC13628l.amazon(interfaceC0684l, "DROP TABLE IF EXISTS `WorkName`");
        AbstractC13628l.amazon(interfaceC0684l, "DROP TABLE IF EXISTS `WorkProgress`");
        AbstractC13628l.amazon(interfaceC0684l, "DROP TABLE IF EXISTS `Preference`");
    }

    @Override // defpackage.AbstractC9963l
    public final C10997l mopub(InterfaceC0684l interfaceC0684l) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("work_spec_id", new C7057l(1, 1, "work_spec_id", "TEXT", null, true));
        linkedHashMap.put("prerequisite_id", new C7057l(2, 1, "prerequisite_id", "TEXT", null, true));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new C7707l("WorkSpec", "CASCADE", "CASCADE", Collections.singletonList("work_spec_id"), Collections.singletonList("id")));
        linkedHashSet.add(new C7707l("WorkSpec", "CASCADE", "CASCADE", Collections.singletonList("prerequisite_id"), Collections.singletonList("id")));
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new C14337l("index_Dependency_work_spec_id", false, Collections.singletonList("work_spec_id"), Collections.singletonList("ASC")));
        linkedHashSet2.add(new C14337l("index_Dependency_prerequisite_id", false, Collections.singletonList("prerequisite_id"), Collections.singletonList("ASC")));
        C8139l c8139l = new C8139l("Dependency", linkedHashMap, linkedHashSet, linkedHashSet2);
        C8139l c8139lLicense = AbstractC5998l.license(interfaceC0684l, "Dependency");
        if (!c8139l.equals(c8139lLicense)) {
            return new C10997l("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + c8139l + "\n Found:\n" + c8139lLicense, false);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("id", new C7057l(1, 1, "id", "TEXT", null, true));
        linkedHashMap2.put("state", new C7057l(0, 1, "state", "INTEGER", null, true));
        linkedHashMap2.put("worker_class_name", new C7057l(0, 1, "worker_class_name", "TEXT", null, true));
        linkedHashMap2.put("input_merger_class_name", new C7057l(0, 1, "input_merger_class_name", "TEXT", null, true));
        linkedHashMap2.put("input", new C7057l(0, 1, "input", "BLOB", null, true));
        linkedHashMap2.put("output", new C7057l(0, 1, "output", "BLOB", null, true));
        linkedHashMap2.put("initial_delay", new C7057l(0, 1, "initial_delay", "INTEGER", null, true));
        linkedHashMap2.put("interval_duration", new C7057l(0, 1, "interval_duration", "INTEGER", null, true));
        linkedHashMap2.put("flex_duration", new C7057l(0, 1, "flex_duration", "INTEGER", null, true));
        linkedHashMap2.put("run_attempt_count", new C7057l(0, 1, "run_attempt_count", "INTEGER", null, true));
        linkedHashMap2.put("backoff_policy", new C7057l(0, 1, "backoff_policy", "INTEGER", null, true));
        linkedHashMap2.put("backoff_delay_duration", new C7057l(0, 1, "backoff_delay_duration", "INTEGER", null, true));
        linkedHashMap2.put("last_enqueue_time", new C7057l(0, 1, "last_enqueue_time", "INTEGER", "-1", true));
        linkedHashMap2.put("minimum_retention_duration", new C7057l(0, 1, "minimum_retention_duration", "INTEGER", null, true));
        linkedHashMap2.put("schedule_requested_at", new C7057l(0, 1, "schedule_requested_at", "INTEGER", null, true));
        linkedHashMap2.put("run_in_foreground", new C7057l(0, 1, "run_in_foreground", "INTEGER", null, true));
        linkedHashMap2.put("out_of_quota_policy", new C7057l(0, 1, "out_of_quota_policy", "INTEGER", null, true));
        linkedHashMap2.put("period_count", new C7057l(0, 1, "period_count", "INTEGER", "0", true));
        linkedHashMap2.put("generation", new C7057l(0, 1, "generation", "INTEGER", "0", true));
        linkedHashMap2.put("next_schedule_time_override", new C7057l(0, 1, "next_schedule_time_override", "INTEGER", "9223372036854775807", true));
        linkedHashMap2.put("next_schedule_time_override_generation", new C7057l(0, 1, "next_schedule_time_override_generation", "INTEGER", "0", true));
        linkedHashMap2.put("stop_reason", new C7057l(0, 1, "stop_reason", "INTEGER", "-256", true));
        linkedHashMap2.put("trace_tag", new C7057l(0, 1, "trace_tag", "TEXT", null, false));
        linkedHashMap2.put("backoff_on_system_interruptions", new C7057l(0, 1, "backoff_on_system_interruptions", "INTEGER", null, false));
        linkedHashMap2.put("required_network_type", new C7057l(0, 1, "required_network_type", "INTEGER", null, true));
        linkedHashMap2.put("required_network_request", new C7057l(0, 1, "required_network_request", "BLOB", "x''", true));
        linkedHashMap2.put("requires_charging", new C7057l(0, 1, "requires_charging", "INTEGER", null, true));
        linkedHashMap2.put("requires_device_idle", new C7057l(0, 1, "requires_device_idle", "INTEGER", null, true));
        linkedHashMap2.put("requires_battery_not_low", new C7057l(0, 1, "requires_battery_not_low", "INTEGER", null, true));
        linkedHashMap2.put("requires_storage_not_low", new C7057l(0, 1, "requires_storage_not_low", "INTEGER", null, true));
        linkedHashMap2.put("trigger_content_update_delay", new C7057l(0, 1, "trigger_content_update_delay", "INTEGER", null, true));
        linkedHashMap2.put("trigger_max_content_delay", new C7057l(0, 1, "trigger_max_content_delay", "INTEGER", null, true));
        linkedHashMap2.put("content_uri_triggers", new C7057l(0, 1, "content_uri_triggers", "BLOB", null, true));
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        linkedHashSet4.add(new C14337l("index_WorkSpec_schedule_requested_at", false, Collections.singletonList("schedule_requested_at"), Collections.singletonList("ASC")));
        linkedHashSet4.add(new C14337l("index_WorkSpec_last_enqueue_time", false, Collections.singletonList("last_enqueue_time"), Collections.singletonList("ASC")));
        C8139l c8139l2 = new C8139l("WorkSpec", linkedHashMap2, linkedHashSet3, linkedHashSet4);
        C8139l c8139lLicense2 = AbstractC5998l.license(interfaceC0684l, "WorkSpec");
        if (!c8139l2.equals(c8139lLicense2)) {
            return new C10997l("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + c8139l2 + "\n Found:\n" + c8139lLicense2, false);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("tag", new C7057l(1, 1, "tag", "TEXT", null, true));
        linkedHashMap3.put("work_spec_id", new C7057l(2, 1, "work_spec_id", "TEXT", null, true));
        LinkedHashSet linkedHashSet5 = new LinkedHashSet();
        linkedHashSet5.add(new C7707l("WorkSpec", "CASCADE", "CASCADE", Collections.singletonList("work_spec_id"), Collections.singletonList("id")));
        LinkedHashSet linkedHashSet6 = new LinkedHashSet();
        linkedHashSet6.add(new C14337l("index_WorkTag_work_spec_id", false, Collections.singletonList("work_spec_id"), Collections.singletonList("ASC")));
        C8139l c8139l3 = new C8139l("WorkTag", linkedHashMap3, linkedHashSet5, linkedHashSet6);
        C8139l c8139lLicense3 = AbstractC5998l.license(interfaceC0684l, "WorkTag");
        if (!c8139l3.equals(c8139lLicense3)) {
            return new C10997l("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + c8139l3 + "\n Found:\n" + c8139lLicense3, false);
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put("work_spec_id", new C7057l(1, 1, "work_spec_id", "TEXT", null, true));
        linkedHashMap4.put("generation", new C7057l(2, 1, "generation", "INTEGER", "0", true));
        linkedHashMap4.put("system_id", new C7057l(0, 1, "system_id", "INTEGER", null, true));
        LinkedHashSet linkedHashSet7 = new LinkedHashSet();
        linkedHashSet7.add(new C7707l("WorkSpec", "CASCADE", "CASCADE", Collections.singletonList("work_spec_id"), Collections.singletonList("id")));
        C8139l c8139l4 = new C8139l("SystemIdInfo", linkedHashMap4, linkedHashSet7, new LinkedHashSet());
        C8139l c8139lLicense4 = AbstractC5998l.license(interfaceC0684l, "SystemIdInfo");
        if (!c8139l4.equals(c8139lLicense4)) {
            return new C10997l("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + c8139l4 + "\n Found:\n" + c8139lLicense4, false);
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        linkedHashMap5.put("name", new C7057l(1, 1, "name", "TEXT", null, true));
        linkedHashMap5.put("work_spec_id", new C7057l(2, 1, "work_spec_id", "TEXT", null, true));
        LinkedHashSet linkedHashSet8 = new LinkedHashSet();
        linkedHashSet8.add(new C7707l("WorkSpec", "CASCADE", "CASCADE", Collections.singletonList("work_spec_id"), Collections.singletonList("id")));
        LinkedHashSet linkedHashSet9 = new LinkedHashSet();
        linkedHashSet9.add(new C14337l("index_WorkName_work_spec_id", false, Collections.singletonList("work_spec_id"), Collections.singletonList("ASC")));
        C8139l c8139l5 = new C8139l("WorkName", linkedHashMap5, linkedHashSet8, linkedHashSet9);
        C8139l c8139lLicense5 = AbstractC5998l.license(interfaceC0684l, "WorkName");
        if (!c8139l5.equals(c8139lLicense5)) {
            return new C10997l("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + c8139l5 + "\n Found:\n" + c8139lLicense5, false);
        }
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        linkedHashMap6.put("work_spec_id", new C7057l(1, 1, "work_spec_id", "TEXT", null, true));
        linkedHashMap6.put("progress", new C7057l(0, 1, "progress", "BLOB", null, true));
        LinkedHashSet linkedHashSet10 = new LinkedHashSet();
        linkedHashSet10.add(new C7707l("WorkSpec", "CASCADE", "CASCADE", Collections.singletonList("work_spec_id"), Collections.singletonList("id")));
        C8139l c8139l6 = new C8139l("WorkProgress", linkedHashMap6, linkedHashSet10, new LinkedHashSet());
        C8139l c8139lLicense6 = AbstractC5998l.license(interfaceC0684l, "WorkProgress");
        if (!c8139l6.equals(c8139lLicense6)) {
            return new C10997l("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + c8139l6 + "\n Found:\n" + c8139lLicense6, false);
        }
        LinkedHashMap linkedHashMap7 = new LinkedHashMap();
        linkedHashMap7.put("key", new C7057l(1, 1, "key", "TEXT", null, true));
        linkedHashMap7.put("long_value", new C7057l(0, 1, "long_value", "INTEGER", null, false));
        C8139l c8139l7 = new C8139l("Preference", linkedHashMap7, new LinkedHashSet(), new LinkedHashSet());
        C8139l c8139lLicense7 = AbstractC5998l.license(interfaceC0684l, "Preference");
        if (c8139l7.equals(c8139lLicense7)) {
            return new C10997l(null, true);
        }
        return new C10997l("Preference(androidx.work.impl.model.Preference).\n Expected:\n" + c8139l7 + "\n Found:\n" + c8139lLicense7, false);
    }

    @Override // defpackage.AbstractC9963l
    public final void yandex(InterfaceC0684l interfaceC0684l) {
        AbstractC13628l.amazon(interfaceC0684l, "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        AbstractC13628l.amazon(interfaceC0684l, "CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        AbstractC13628l.amazon(interfaceC0684l, "CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        AbstractC13628l.amazon(interfaceC0684l, "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `backoff_on_system_interruptions` INTEGER, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        AbstractC13628l.amazon(interfaceC0684l, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        AbstractC13628l.amazon(interfaceC0684l, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        AbstractC13628l.amazon(interfaceC0684l, "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        AbstractC13628l.amazon(interfaceC0684l, "CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        AbstractC13628l.amazon(interfaceC0684l, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        AbstractC13628l.amazon(interfaceC0684l, "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        AbstractC13628l.amazon(interfaceC0684l, "CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        AbstractC13628l.amazon(interfaceC0684l, "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        AbstractC13628l.amazon(interfaceC0684l, "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        AbstractC13628l.amazon(interfaceC0684l, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        AbstractC13628l.amazon(interfaceC0684l, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '08b926448d86528e697981ddd30459f7')");
    }

    @Override // defpackage.AbstractC9963l
    public final void crashlytics() {
    }

    @Override // defpackage.AbstractC9963l
    public final void purchase() {
    }
}
