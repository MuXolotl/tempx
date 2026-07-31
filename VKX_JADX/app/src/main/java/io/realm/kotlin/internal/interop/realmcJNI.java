package io.realm.kotlin.internal.interop;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class realmcJNI {
    public static final native long RLM_INVALID_CLASS_KEY_get();

    public static final native long RLM_INVALID_PROPERTY_KEY_get();

    public static final native long classArray_getitem(long j, realm_class_info_t realm_class_info_tVar, int i);

    public static final native void classArray_setitem(long j, realm_class_info_t realm_class_info_tVar, int i, long j2, realm_class_info_t realm_class_info_tVar2);

    public static final native void delete_classArray(long j, realm_class_info_t realm_class_info_tVar);

    public static final native void delete_collectionMoveArray(long j, realm_collection_move_t realm_collection_move_tVar);

    public static final native void delete_indexRangeArray(long j, realm_index_range_t realm_index_range_tVar);

    public static final native void delete_propertyArray(long j, realm_property_info_t realm_property_info_tVar);

    public static final native void delete_propertyArrayArray(long j);

    public static final native void delete_queryArgArray(long j, realm_query_arg_t realm_query_arg_tVar);

    public static final native void delete_realm_binary_t(long j);

    public static final native void delete_realm_class_info_t(long j);

    public static final native void delete_realm_decimal128_t(long j);

    public static final native void delete_realm_index_range_t(long j);

    public static final native void delete_realm_link_t(long j);

    public static final native void delete_realm_object_id_t(long j);

    public static final native void delete_realm_property_info_t(long j);

    public static final native void delete_realm_query_arg_t(long j);

    public static final native void delete_realm_timestamp_t(long j);

    public static final native void delete_realm_uuid_t(long j);

    public static final native void delete_realm_value_t(long j);

    public static final native void delete_realm_version_id_t(long j);

    public static final native void delete_valueArray(long j, realm_value_t realm_value_tVar);

    public static final native long indexRangeArray_getitem(long j, realm_index_range_t realm_index_range_tVar, int i);

    public static final native void invoke_core_notify_callback(long j);

    public static final native long new_classArray(int i);

    public static final native long new_collectionMoveArray(int i);

    public static final native long new_indexRangeArray(int i);

    public static final native long new_propertyArray(int i);

    public static final native long new_propertyArrayArray(int i);

    public static final native long new_queryArgArray(int i);

    public static final native long new_realm_binary_t();

    public static final native long new_realm_class_info_t();

    public static final native long new_realm_decimal128_t();

    public static final native long new_realm_object_id_t();

    public static final native long new_realm_property_info_t();

    public static final native long new_realm_query_arg_t();

    public static final native long new_realm_timestamp_t();

    public static final native long new_realm_uuid_t();

    public static final native long new_realm_value_t();

    public static final native long new_realm_version_id_t();

    public static final native long new_valueArray(int i);

    public static final native long propertyArrayArray_getitem(long j, int i);

    public static final native void propertyArrayArray_setitem(long j, int i, long j2, realm_property_info_t realm_property_info_tVar);

    public static final native long propertyArray_getitem(long j, realm_property_info_t realm_property_info_tVar, int i);

    public static final native void propertyArray_setitem(long j, realm_property_info_t realm_property_info_tVar, int i, long j2, realm_property_info_t realm_property_info_tVar2);

    public static final native void queryArgArray_setitem(long j, realm_query_arg_t realm_query_arg_tVar, int i, long j2, realm_query_arg_t realm_query_arg_tVar2);

    public static final native long realm_add_realm_changed_callback(long j, Object obj);

    public static final native long realm_add_schema_changed_callback(long j, Object obj);

    public static final native boolean realm_begin_read(long j);

    public static final native boolean realm_begin_write(long j);

    public static final native byte[] realm_binary_t_data_get(long j, realm_binary_t realm_binary_tVar);

    public static final native void realm_binary_t_data_set(long j, realm_binary_t realm_binary_tVar, byte[] bArr);

    public static final native void realm_binary_t_size_set(long j, realm_binary_t realm_binary_tVar, long j2);

    public static final native void realm_class_info_t_cleanup(long j, realm_class_info_t realm_class_info_tVar);

    public static final native int realm_class_info_t_flags_get(long j, realm_class_info_t realm_class_info_tVar);

    public static final native void realm_class_info_t_flags_set(long j, realm_class_info_t realm_class_info_tVar, int i);

    public static final native long realm_class_info_t_key_get(long j, realm_class_info_t realm_class_info_tVar);

    public static final native void realm_class_info_t_key_set(long j, realm_class_info_t realm_class_info_tVar, long j2);

    public static final native String realm_class_info_t_name_get(long j, realm_class_info_t realm_class_info_tVar);

    public static final native void realm_class_info_t_name_set(long j, realm_class_info_t realm_class_info_tVar, String str);

    public static final native long realm_class_info_t_num_computed_properties_get(long j, realm_class_info_t realm_class_info_tVar);

    public static final native void realm_class_info_t_num_computed_properties_set(long j, realm_class_info_t realm_class_info_tVar, long j2);

    public static final native long realm_class_info_t_num_properties_get(long j, realm_class_info_t realm_class_info_tVar);

    public static final native void realm_class_info_t_num_properties_set(long j, realm_class_info_t realm_class_info_tVar, long j2);

    public static final native String realm_class_info_t_primary_key_get(long j, realm_class_info_t realm_class_info_tVar);

    public static final native void realm_class_info_t_primary_key_set(long j, realm_class_info_t realm_class_info_tVar, String str);

    public static final native long realm_clone(long j);

    public static final native boolean realm_close(long j);

    public static final native void realm_collection_changes_get_changes(long j, long[] jArr, long j2, long[] jArr2, long j3, long[] jArr3, long j4, long[] jArr4, long j5, long j6, realm_collection_move_t realm_collection_move_tVar, long j7);

    public static final native void realm_collection_changes_get_num_changes(long j, long[] jArr, long[] jArr2, long[] jArr3, long[] jArr4, boolean[] zArr, boolean[] zArr2);

    public static final native void realm_collection_changes_get_num_ranges(long j, long[] jArr, long[] jArr2, long[] jArr3, long[] jArr4);

    public static final native void realm_collection_changes_get_ranges(long j, long j2, realm_index_range_t realm_index_range_tVar, long j3, long j4, realm_index_range_t realm_index_range_tVar2, long j5, long j6, realm_index_range_t realm_index_range_tVar3, long j7, long j8, realm_index_range_t realm_index_range_tVar4, long j9, long j10, realm_collection_move_t realm_collection_move_tVar, long j11);

    public static final native boolean realm_commit(long j);

    public static final native long realm_config_new();

    public static final native void realm_config_set_automatic_backlink_handling(long j, boolean z);

    public static final native void realm_config_set_data_initialization_function(long j, Object obj);

    public static final native void realm_config_set_in_memory(long j, boolean z);

    public static final native void realm_config_set_max_number_of_active_versions(long j, long j2);

    public static final native void realm_config_set_migration_function(long j, Object obj);

    public static final native void realm_config_set_path(long j, String str);

    public static final native void realm_config_set_scheduler(long j, long j2);

    public static final native void realm_config_set_schema(long j, long j2);

    public static final native void realm_config_set_schema_mode(long j, int i);

    public static final native void realm_config_set_schema_version(long j, long j2);

    public static final native void realm_config_set_should_compact_on_launch_function(long j, Object obj);

    public static final native boolean realm_convert_with_config(long j, long j2, boolean z);

    public static final native long realm_create_generic_scheduler();

    public static final native long realm_create_key_path_array(long j, long j2, long j3, String[] strArr);

    public static final native long realm_create_scheduler(Object obj);

    public static final native long[] realm_decimal128_t_w_get(long j, realm_decimal128_t realm_decimal128_tVar);

    public static final native void realm_decimal128_t_w_set(long j, realm_decimal128_t realm_decimal128_tVar, long[] jArr);

    public static final native boolean realm_delete_files(String str, boolean[] zArr);

    public static final native boolean realm_dictionary_clear(long j);

    public static final native boolean realm_dictionary_contains_key(long j, long j2, realm_value_t realm_value_tVar, boolean[] zArr);

    public static final native boolean realm_dictionary_contains_value(long j, long j2, realm_value_t realm_value_tVar, long[] jArr);

    public static final native boolean realm_dictionary_erase(long j, long j2, realm_value_t realm_value_tVar, boolean[] zArr);

    public static final native boolean realm_dictionary_find(long j, long j2, realm_value_t realm_value_tVar, long j3, realm_value_t realm_value_tVar2, boolean[] zArr);

    public static final native boolean realm_dictionary_get(long j, long j2, long j3, realm_value_t realm_value_tVar, long j4, realm_value_t realm_value_tVar2);

    public static final native void realm_dictionary_get_changed_keys(long j, long j2, realm_value_t realm_value_tVar, long[] jArr, long j3, realm_value_t realm_value_tVar2, long[] jArr2, long j4, realm_value_t realm_value_tVar3, long[] jArr3, boolean[] zArr);

    public static final native void realm_dictionary_get_changes(long j, long[] jArr, long[] jArr2, long[] jArr3, boolean[] zArr);

    public static final native long realm_dictionary_get_dictionary(long j, long j2, realm_value_t realm_value_tVar);

    public static final native boolean realm_dictionary_get_keys(long j, long[] jArr, long[] jArr2);

    public static final native long realm_dictionary_get_list(long j, long j2, realm_value_t realm_value_tVar);

    public static final native boolean realm_dictionary_insert(long j, long j2, realm_value_t realm_value_tVar, long j3, realm_value_t realm_value_tVar2, long[] jArr, boolean[] zArr);

    public static final native long realm_dictionary_insert_dictionary(long j, long j2, realm_value_t realm_value_tVar);

    public static final native long realm_dictionary_insert_embedded(long j, long j2, realm_value_t realm_value_tVar);

    public static final native long realm_dictionary_insert_list(long j, long j2, realm_value_t realm_value_tVar);

    public static final native boolean realm_dictionary_is_valid(long j);

    public static final native boolean realm_dictionary_size(long j, long[] jArr);

    public static final native long realm_dictionary_to_results(long j);

    public static final native boolean realm_equals(long j, long j2);

    public static final native long realm_freeze(long j);

    public static final native long realm_get_backlinks(long j, long j2, long j3);

    public static final native boolean realm_get_class(long j, long j2, long j3, realm_class_info_t realm_class_info_tVar);

    public static final native boolean realm_get_class_keys(long j, long[] jArr, long j2, long[] jArr2);

    public static final native boolean realm_get_class_properties(long j, long j2, long j3, realm_property_info_t realm_property_info_tVar, long j4, long[] jArr);

    public static final native long realm_get_dictionary(long j, long j2);

    public static final native long realm_get_list(long j, long j2);

    public static final native int realm_get_log_level_category(String str);

    public static final native long realm_get_num_classes(long j);

    public static final native long realm_get_object(long j, long j2, long j3);

    public static final native long realm_get_schema_version(long j);

    public static final native long realm_get_set(long j, long j2);

    public static final native boolean realm_get_value(long j, long j2, long j3, realm_value_t realm_value_tVar);

    public static final native boolean realm_get_version_id(long j, boolean[] zArr, long j2, realm_version_id_t realm_version_id_tVar);

    public static final native long realm_index_range_t_from_get(long j, realm_index_range_t realm_index_range_tVar);

    public static final native long realm_index_range_t_to_get(long j, realm_index_range_t realm_index_range_tVar);

    public static final native boolean realm_is_closed(long j);

    public static final native boolean realm_is_frozen(long j);

    public static final native boolean realm_is_writable(long j);

    public static final native long realm_link_t_target_get(long j, realm_link_t realm_link_tVar);

    public static final native long realm_link_t_target_table_get(long j, realm_link_t realm_link_tVar);

    public static final native boolean realm_list_clear(long j);

    public static final native boolean realm_list_erase(long j, long j2);

    public static final native boolean realm_list_find(long j, long j2, realm_value_t realm_value_tVar, long[] jArr, boolean[] zArr);

    public static final native boolean realm_list_get(long j, long j2, long j3, realm_value_t realm_value_tVar);

    public static final native long realm_list_get_dictionary(long j, long j2);

    public static final native long realm_list_get_list(long j, long j2);

    public static final native boolean realm_list_insert(long j, long j2, long j3, realm_value_t realm_value_tVar);

    public static final native long realm_list_insert_dictionary(long j, long j2);

    public static final native long realm_list_insert_embedded(long j, long j2);

    public static final native long realm_list_insert_list(long j, long j2);

    public static final native boolean realm_list_is_valid(long j);

    public static final native boolean realm_list_remove_all(long j);

    public static final native boolean realm_list_resolve_in(long j, long j2, long[] jArr);

    public static final native boolean realm_list_set(long j, long j2, long j3, realm_value_t realm_value_tVar);

    public static final native long realm_list_set_dictionary(long j, long j2);

    public static final native long realm_list_set_embedded(long j, long j2);

    public static final native long realm_list_set_list(long j, long j2);

    public static final native boolean realm_list_size(long j, long[] jArr);

    public static final native long realm_object_as_link(long j);

    public static final native long realm_object_changes_get_modified_properties(long j, long[] jArr, long j2);

    public static final native long realm_object_changes_get_num_modified_properties(long j);

    public static final native long realm_object_create(long j, long j2);

    public static final native long realm_object_create_with_primary_key(long j, long j2, long j3, realm_value_t realm_value_tVar);

    public static final native boolean realm_object_delete(long j);

    public static final native long realm_object_get_key(long j);

    public static final native long realm_object_get_or_create_with_primary_key(long j, long j2, long j3, realm_value_t realm_value_tVar, boolean[] zArr);

    public static final native long realm_object_get_table(long j);

    public static final native short[] realm_object_id_t_bytes_get(long j, realm_object_id_t realm_object_id_tVar);

    public static final native void realm_object_id_t_bytes_set(long j, realm_object_id_t realm_object_id_tVar, short[] sArr);

    public static final native boolean realm_object_is_valid(long j);

    public static final native boolean realm_object_resolve_in(long j, long j2, long[] jArr);

    public static final native long realm_open(long j);

    public static final native void realm_property_info_t_cleanup(long j, realm_property_info_t realm_property_info_tVar);

    public static final native int realm_property_info_t_collection_type_get(long j, realm_property_info_t realm_property_info_tVar);

    public static final native void realm_property_info_t_collection_type_set(long j, realm_property_info_t realm_property_info_tVar, int i);

    public static final native int realm_property_info_t_flags_get(long j, realm_property_info_t realm_property_info_tVar);

    public static final native void realm_property_info_t_flags_set(long j, realm_property_info_t realm_property_info_tVar, int i);

    public static final native long realm_property_info_t_key_get(long j, realm_property_info_t realm_property_info_tVar);

    public static final native void realm_property_info_t_key_set(long j, realm_property_info_t realm_property_info_tVar, long j2);

    public static final native String realm_property_info_t_link_origin_property_name_get(long j, realm_property_info_t realm_property_info_tVar);

    public static final native void realm_property_info_t_link_origin_property_name_set(long j, realm_property_info_t realm_property_info_tVar, String str);

    public static final native String realm_property_info_t_link_target_get(long j, realm_property_info_t realm_property_info_tVar);

    public static final native void realm_property_info_t_link_target_set(long j, realm_property_info_t realm_property_info_tVar, String str);

    public static final native String realm_property_info_t_name_get(long j, realm_property_info_t realm_property_info_tVar);

    public static final native void realm_property_info_t_name_set(long j, realm_property_info_t realm_property_info_tVar, String str);

    public static final native String realm_property_info_t_public_name_get(long j, realm_property_info_t realm_property_info_tVar);

    public static final native void realm_property_info_t_public_name_set(long j, realm_property_info_t realm_property_info_tVar, String str);

    public static final native int realm_property_info_t_type_get(long j, realm_property_info_t realm_property_info_tVar);

    public static final native void realm_property_info_t_type_set(long j, realm_property_info_t realm_property_info_tVar, int i);

    public static final native long realm_query_append_query(long j, String str, long j2, long j3, realm_query_arg_t realm_query_arg_tVar);

    public static final native void realm_query_arg_t_arg_set(long j, realm_query_arg_t realm_query_arg_tVar, long j2, realm_value_t realm_value_tVar);

    public static final native void realm_query_arg_t_is_list_set(long j, realm_query_arg_t realm_query_arg_tVar, boolean z);

    public static final native void realm_query_arg_t_nb_args_set(long j, realm_query_arg_t realm_query_arg_tVar, long j2);

    public static final native boolean realm_query_count(long j, long[] jArr);

    public static final native long realm_query_find_all(long j);

    public static final native boolean realm_query_find_first(long j, long j2, realm_value_t realm_value_tVar, boolean[] zArr);

    public static final native long realm_query_parse(long j, long j2, String str, long j3, long j4, realm_query_arg_t realm_query_arg_tVar);

    public static final native boolean realm_refresh(long j, boolean[] zArr);

    public static final native void realm_release(long j);

    public static final native boolean realm_results_count(long j, long[] jArr);

    public static final native boolean realm_results_delete_all(long j);

    public static final native boolean realm_results_get(long j, long j2, long j3, realm_value_t realm_value_tVar);

    public static final native long realm_results_get_dictionary(long j, long j2);

    public static final native long realm_results_get_list(long j, long j2);

    public static final native long realm_results_resolve_in(long j, long j2);

    public static final native boolean realm_rollback(long j);

    public static final native long realm_schema_new(long j, realm_class_info_t realm_class_info_tVar, long j2, long j3);

    public static final native boolean realm_set_clear(long j);

    public static final native long realm_set_dictionary(long j, long j2);

    public static final native long realm_set_embedded(long j, long j2);

    public static final native boolean realm_set_erase(long j, long j2, realm_value_t realm_value_tVar, boolean[] zArr);

    public static final native boolean realm_set_find(long j, long j2, realm_value_t realm_value_tVar, long[] jArr, boolean[] zArr);

    public static final native boolean realm_set_get(long j, long j2, long j3, realm_value_t realm_value_tVar);

    public static final native boolean realm_set_insert(long j, long j2, realm_value_t realm_value_tVar, long[] jArr, boolean[] zArr);

    public static final native boolean realm_set_is_valid(long j);

    public static final native long realm_set_list(long j, long j2);

    public static final native int realm_set_log_level_category(String str, int i);

    public static final native boolean realm_set_remove_all(long j);

    public static final native boolean realm_set_resolve_in(long j, long j2, long[] jArr);

    public static final native boolean realm_set_size(long j, long[] jArr);

    public static final native boolean realm_set_value(long j, long j2, long j3, realm_value_t realm_value_tVar, boolean z);

    public static final native int realm_timestamp_t_nanoseconds_get(long j, realm_timestamp_t realm_timestamp_tVar);

    public static final native void realm_timestamp_t_nanoseconds_set(long j, realm_timestamp_t realm_timestamp_tVar, int i);

    public static final native long realm_timestamp_t_seconds_get(long j, realm_timestamp_t realm_timestamp_tVar);

    public static final native void realm_timestamp_t_seconds_set(long j, realm_timestamp_t realm_timestamp_tVar, long j2);

    public static final native short[] realm_uuid_t_bytes_get(long j, realm_uuid_t realm_uuid_tVar);

    public static final native void realm_uuid_t_bytes_set(long j, realm_uuid_t realm_uuid_tVar, short[] sArr);

    public static final native boolean realm_value_t__boolean_get(long j, realm_value_t realm_value_tVar);

    public static final native void realm_value_t__boolean_set(long j, realm_value_t realm_value_tVar, boolean z);

    public static final native long realm_value_t_binary_get(long j, realm_value_t realm_value_tVar);

    public static final native void realm_value_t_binary_set(long j, realm_value_t realm_value_tVar, long j2, realm_binary_t realm_binary_tVar);

    public static final native void realm_value_t_cleanup(long j, realm_value_t realm_value_tVar);

    public static final native long realm_value_t_decimal128_get(long j, realm_value_t realm_value_tVar);

    public static final native void realm_value_t_decimal128_set(long j, realm_value_t realm_value_tVar, long j2, realm_decimal128_t realm_decimal128_tVar);

    public static final native double realm_value_t_dnum_get(long j, realm_value_t realm_value_tVar);

    public static final native void realm_value_t_dnum_set(long j, realm_value_t realm_value_tVar, double d);

    public static final native float realm_value_t_fnum_get(long j, realm_value_t realm_value_tVar);

    public static final native void realm_value_t_fnum_set(long j, realm_value_t realm_value_tVar, float f);

    public static final native long realm_value_t_integer_get(long j, realm_value_t realm_value_tVar);

    public static final native void realm_value_t_integer_set(long j, realm_value_t realm_value_tVar, long j2);

    public static final native long realm_value_t_link_get(long j, realm_value_t realm_value_tVar);

    public static final native void realm_value_t_link_set(long j, realm_value_t realm_value_tVar, long j2, realm_link_t realm_link_tVar);

    public static final native long realm_value_t_object_id_get(long j, realm_value_t realm_value_tVar);

    public static final native void realm_value_t_object_id_set(long j, realm_value_t realm_value_tVar, long j2, realm_object_id_t realm_object_id_tVar);

    public static final native String realm_value_t_string_get(long j, realm_value_t realm_value_tVar);

    public static final native void realm_value_t_string_set(long j, realm_value_t realm_value_tVar, String str);

    public static final native long realm_value_t_timestamp_get(long j, realm_value_t realm_value_tVar);

    public static final native void realm_value_t_timestamp_set(long j, realm_value_t realm_value_tVar, long j2, realm_timestamp_t realm_timestamp_tVar);

    public static final native int realm_value_t_type_get(long j, realm_value_t realm_value_tVar);

    public static final native void realm_value_t_type_set(long j, realm_value_t realm_value_tVar, int i);

    public static final native long realm_value_t_uuid_get(long j, realm_value_t realm_value_tVar);

    public static final native void realm_value_t_uuid_set(long j, realm_value_t realm_value_tVar, long j2, realm_uuid_t realm_uuid_tVar);

    public static final native long realm_version_id_t_version_get(long j, realm_version_id_t realm_version_id_tVar);

    public static final native long register_notification_cb(long j, int i, long j2, Object obj);

    public static final native long register_results_notification_cb(long j, long j2, Object obj);

    public static final native void set_log_callback(Object obj);

    public static final native long valueArray_getitem(long j, realm_value_t realm_value_tVar, int i);

    public static final native void valueArray_setitem(long j, realm_value_t realm_value_tVar, int i, long j2, realm_value_t realm_value_tVar2);
}
